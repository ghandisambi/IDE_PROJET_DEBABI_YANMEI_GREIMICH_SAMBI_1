
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
        
    } 
    public PageId AllocPage() {
        int nbFichier = listFichiers.size();
        for (Fichier fichier : listFichiers) {
            if(!fichier.estPlein()){
                fichier.addPages();
            }else{
                listFichiers.add(new Fichier("F"+(nbFichier+1)+".df"));
            }      
        }
        return pageId;
    }
   
    public void ReadPage(PageId pageId,ByteBuffer buff) {   
       

        
    }
    public void WritePage(PageId pageId,ByteBuffer buff){

    }


}
