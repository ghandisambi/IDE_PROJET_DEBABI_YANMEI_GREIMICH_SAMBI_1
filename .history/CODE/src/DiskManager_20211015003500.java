
import java.nio.ByteBuffer;
import java.util.Vector;

public class DiskManager {
    
    private PageId pageId;
    private Vector <Fichier> listFichiers;
    
    
    public static void A(String x) {
        System.out.println(x);
    }
    public DiskManager(PageId pageId){
        this.pageId = pageId;
        listFichiers= new Vector<>();
        listFichiers.add(new Fichier(DBParams.DBPath,"/F",0,".df"));
        for (Fichier f : listFichiers) {

            if(f.ajoutePage()){
                A("la page a été ajouté");
            }else{
                A("la page n'a pas pu être ajouté");
            }            
        }
        for(int i =0; i<4; i++){
            listFichiers.add(new Fichier(DBParams.DBPath,"/F",i,".df"));
        }
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
