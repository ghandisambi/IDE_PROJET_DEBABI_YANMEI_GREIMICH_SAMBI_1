
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
               
        for (Fichier fichier : listFichiers) {
            if(!fichier.estPlein()){
                fichier.addPages();
                pageId.setFileIdx(fichier.getFileIdx());
                pageId.setPageIdx(fichier.getIdPage());
            }      
        }       
        
        return pageId;
    }
   
    public void ReadPage(PageId pageId,ByteBuffer buff) {   
       

        
    }
    public void WritePage(PageId pageId,ByteBuffer buff){

    }


}
