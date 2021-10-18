
import java.nio.ByteBuffer;
import java.util.Vector;

public class DiskManager {
    
    private PageId pageId;
    private Vector <Fichier> listFichiers;
    
    

    public DiskManager(PageId pageId){
        this.pageId = pageId;
        listFichiers= new Vector<>();
        listFichiers.add(new Fichier(DBParams.DBPath,"/F",0,".df"));
        for (Fichier f : listFichiers) {

            f.ajoutePage();
            
        }
        
    }
    public DiskManager(){
        listFichiers= new Vector<>();
        for(int i =0; i<4; i++){
            listFichiers.add(new Fichier(DBParams.DBPath,"/F",i,".df"));
        }
        

    } 
    public PageId AllocPage() {
        boolean dernierFichier = false;
        for (Fichier fichier : listFichiers) {
            if(fichier.tailleMax()){
                if(fichier.getIndex()==listFichiers.size()-1){
                    dernierFichier=true;
                }
            }else{
                fichier.ajoutePage();
            }   
        }
        
        if(dernierFichier){
            listFichiers.add(new Fichier(DBParams.DBPath,"/F",listFichiers.size()+1,".df"));
        };

        pageId = new PageId(listFichiers.lastElement().getIndex(), listFichiers.lastElement().getPages().length-1);
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
