import java.io.File;
import java.util.Vector;

public class DiskManager {
    
    private PageId pageId;
    private Vector <Fichier> listFichiers;
    

    public DiskManager(PageId pageId){
        this.pageId = pageId;
        listFichiers= new Vector<>();
        for(int i = 0; i<4;i++){
            listFichiers.add(new Fichier(DBParams.DBPath,"/F",i,".df"));
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
        if(dernierFichier)nouveauFichier(listFichiers.size()+1);
        return pageId;
    }

    private void nouveauFichier(int index){
        Fichier fichier;
        try {
                fichier = new Fichier(DBParams.DBPath,"/F",index,".df"); 
            }
            catch(Exception e) {
                e.getStackTrace();
            }
    
    }
    public PageId ReadPage() {
        return new PageId(0, 0);
    }
    public PageId WritePage(){
        return new PageId(0,0);
    }


}
