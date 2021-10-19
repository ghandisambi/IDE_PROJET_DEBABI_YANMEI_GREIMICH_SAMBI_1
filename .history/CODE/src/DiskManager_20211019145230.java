
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Vector;

public class DiskManager {
    
    private PageId pageId;
    private Vector <Fichier> listFichiers;
    
    
    
    /** 
     * Permet d'affiche dans la console
     * @param x la chaine de caractère que l'on souhaite afficher 
     */
    public static void Affichage(String x) {
        System.out.println(x);
    }
    /**
     * initialisation du diskManager
     */
    public DiskManager(){
        listFichiers= new Vector<>();
        pageId = new PageId(0, 0);
        
        
    } 
    
    /** 
     * Allocation d'une page à un fichier 
     * @return PageId l'index du fichier et de la page alloué 
     */
    public PageId AllocPage() {
        /*On initialise de l'attribut ajouterFichier pour tester
         si on doit créer un nouveau fichier ou pas*/ 
        boolean ajouterFichier = false;
        // On prend en compte le nombre de fichier
        int nbFichier =listFichiers.size();
        if(!listFichiers.isEmpty()){ 
            // Si la liste des fichiers n'est pas vide on la parcourt      
            for (Fichier fichier : listFichiers) {
                if(!fichier.estPlein()){
                    // si le fichier n'est pas plein, on ajouter une page et on n'ajoute pas un nouveau fichier
                    // et on garde le index du fichier et de la page pour les retourner à la couche haute puis on sort de la boucle
                    ajouterFichier=false;
                    fichier.addPages();
                    pageId.setFileIdx(fichier.getFileIdx());
                    pageId.setPageIdx(fichier.getIdPage());
                    System.out.println("allocation de la page_"+fichier.getIdPage()+" au fichier_"+fichier.getChemin());
                    break;
                }else{
                    // sinon on ajoute à la sortie de la boucle
                    ajouterFichier=true;
                }      
            }
            if(ajouterFichier){
                Fichier fichier = new Fichier(DBParams.DBPath+"F"+(nbFichier)+".df");
                try {
                    if (fichier.createNewFile()) {  
                        System.out.println("Fichier crée: " + fichier.getName());  
                      } else {  
                        System.out.println("Fichier déjà crée.");  
                      } 
                } catch (IOException e) {
                    System.out.println("Erreur lors de la création du fichier");
                    e.printStackTrace(); 
                    
                }
                //On ajouter le fichier dans la liste des fichiers et on alloue une nouvelle page
                listFichiers.add(fichier);
                AllocPage();
            }       
        }else{
            // Si la liste des fichiers et vide on ajouter un nouveau fichier puis on alloue une nouvelle page
            Fichier fichier = new Fichier("BD/F0.df");
            try {
                if (fichier.createNewFile()) {  
                    System.out.println("Fichier crée: " + fichier.getName());  
                  } else {  
                    System.out.println("Fichier déjà crée.");  
                  } 
            } catch (IOException e) {
                System.out.println("Erreur lors de la création du fichier");
                e.printStackTrace();
                 
                
            }
            listFichiers.add(fichier);
            AllocPage();


            
        }
        return pageId;
    }
   
    
    /** 
     * Lecture d'un fichier 
     * @param pageId Entrée l'index du fichier et de la page 
     * @param buff Entrée d'un tableau d'octet
     * @throws FileNotFoundException Interception de erreur d'ouverture du fichier
     * @throws IOException 
     */
    public void ReadPage(PageId pageId,ByteBuffer buff) throws FileNotFoundException, IOException {  
        
        Fichier fichier = recherchFichier(pageId);
        RandomAccessFile file = new RandomAccessFile(fichier,"r");
        long i = (pageId.getPageIdx()*DBParams.pageSize);
        file.seek(i);
        file.read(buff.array());
        file.close();
        
    }

    public void ReadPage(PageId pageId){
        FileInputStream lecture = null;
        try {
            // Recherche du fichier 
            Page page = recherchFichier(pageId).getPageFirst(pageId.getPageIdx());
            // lecture du fichier
            lecture = new FileInputStream(recherchFichier(pageId));
            byte [] buf = page.getOctets() ;
            int n;
            
            
            
            while ((n = lecture.read(buf)) >= 0){
                for (byte bit : buf) {
                    System.out.print((char)bit);
                }
                // On réinitialise pour vider le buffer 
                page.reinitialisation();
                buf = page.getOctets();

            } 
            
            
        } catch (Exception e) {
            e.printStackTrace();

        }finally{
            try {
                if (lecture != null)
                lecture.close();
                } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /** 
     * @param pageId
     * @param buff
     */
    public void WritePage(PageId pageId,ByteBuffer buff) throws IOException{
        Fichier fichier = recherchFichier(pageId);
        RandomAccessFile file = new RandomAccessFile(fichier, "rw");
        long i = (pageId.getPageIdx()*DBParams.pageSize);
        file.seek(i);
        file.write(buff.array());
        file.close();

    }
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
    
    /** 
     * @param pageId
     * @return Fichier
     */
    private Fichier recherchFichier(PageId pageId){
        return listFichiers.elementAt(pageId.getFileIdx());
    }
    
    /** 
     * @return Vector<Fichier>
     */
    public Vector<Fichier> getListFichiers() {
        return listFichiers;
    }

    public static void main(String[] args) {
        
    }


}
