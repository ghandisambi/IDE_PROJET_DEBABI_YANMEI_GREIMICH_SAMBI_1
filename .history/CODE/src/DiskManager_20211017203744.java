
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
        int nbFichier = listFichiers.size();
        for (Fichier fichier : listFichiers) {
            System.out.println("allocation");
            if(!fichier.estPlein()){
                fichier.addPages();
                pageId.setFileIdx(fichier.getFileIdx());
                pageId.setPageIdx(fichier.getIdPage());
                break;
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
    @Override
    public String toString() {
        
        return super.toString();
    }


}
