
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
        A("ok");
        listFichiers.add(new Fichier(DBParams.DBPath,"/F",0,".df"));
        A(listFichiers.toString());

    } 
    public PageId AllocPage() {
        boolean dernierFichier = false;
        for (Fichier fichier : listFichiers) {
                fichier.ajoutePage();
                A(fichier.getPages().toString());
                if(fichier.getIndex()==listFichiers.size()-1){
                    dernierFichier=true;
                }
              
        }
        
        if(dernierFichier){
            listFichiers.add(new Fichier(DBParams.DBPath,"/F",listFichiers.size()+1,".df"));
        };

        return pageId;
    }
   
    public void ReadPage(PageId pageId,ByteBuffer buff) {   
       for (Fichier element : listFichiers) {
           if(element.getIndex()==pageId.getFileIdx()){
               
           }
           
       }

        
    }
    public void WritePage(PageId pageId,ByteBuffer buff){

    }


}
