
import java.io.FileInputStream;
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
        Fichier f = new Fichier("BD/F0.df");
        f.addPages();
        f.addPages();
        f.addPages();
        f.addPages();
        listFichiers.add(f);
        listFichiers.add(new Fichier("BD/F1.df"));
        
    } 
    public PageId AllocPage() {
        boolean ajouter = false;
        int nbFichier =listFichiers.size();       
        for (Fichier fichier : listFichiers) {
            if(!fichier.estPlein()){
                ajouter=false;
                fichier.addPages();
                pageId.setFileIdx(fichier.getFileIdx());
                pageId.setPageIdx(fichier.getIdPage());
                System.out.println("allocation");
                break;
            }else{
                ajouter=true;
            }      
        }
        if(ajouter){
            listFichiers.add(new Fichier("F"+(nbFichier)+".df"));
            AllocPage();
        }       
        
        return pageId;
    }
   
    public void ReadPage(PageId pageId,ByteBuffer buff) {  
        Fichier fichier = recherchFichier(pageId);
        

        
        FileInputStream lecture = null;
        try {
            Page page = recherchFichier(pageId).getPage(pageId.getPageIdx());
            lecture = new FileInputStream(recherchFichier(pageId));
            int n=0;
            
            while ((n = lecture.read(page.getOctets())) >= 0){
                
            } 
            
        } catch (Exception e) {
            
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


}
