
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Vector;

public class DiskManager {
    
    private PageId pageId;
    private Vector <Fichier> listFichiers;
    
    
    public static void A(String x) {
        System.out.println(x);
    }
    public DiskManager(){
        listFichiers= new Vector<>();
        pageId = new PageId(0, 0);
        
        
    } 
    public PageId AllocPage() {
        boolean ajouter = false;
        int nbFichier =listFichiers.size();
        if(!listFichiers.isEmpty()){       
            for (Fichier fichier : listFichiers) {
                if(!fichier.estPlein()){
                    ajouter=false;
                    fichier.addPages();
                    pageId.setFileIdx(fichier.getFileIdx());
                    pageId.setPageIdx(fichier.getIdPage());
                    System.out.println("allocation de la page_"+fichier.getIdPage()+" au fichier_"+fichier.getChemin());
                    break;
                }else{
                    ajouter=true;
                }      
            }
            if(ajouter){
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
                
                listFichiers.add(fichier);
                AllocPage();
            }       
        }else{
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
   
    public void ReadPage(PageId pageId,ByteBuffer [] buff) throws FileNotFoundException, IOException {  
        Fichier fichier = recherchFichier(pageId);
        

        
        FileInputStream lecture = null;
        try {
            Page page = recherchFichier(pageId).getPageFirst(pageId.getPageIdx());
            lecture = new FileInputStream(recherchFichier(pageId));
            byte [] buf = page.getOctets() ;
            int n=0;
            
            while ((n = lecture.read(buf)) >= 0){
                for (byte bit : buf) {
                    System.out.print((char)bit);
                }
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
    public void WritePage(PageId pageId,ByteBuffer buff){

    }
    @Override
    public String toString() {
        
        return super.toString();
    }
    private Fichier recherchFichier(PageId pageId){
        return listFichiers.elementAt(pageId.getFileIdx());
    }
    public Vector<Fichier> getListFichiers() {
        return listFichiers;
    }


}
