import java.io.File;
import java.util.Vector;

public class DiskManager {
    
    private PageId pageId;
    private Fichier[] fichiers;
    private Fichier fichier;

    public DiskManager(PageId pageId){
        this.pageId = pageId;
        for(int i =0; i<4; i++){
            fichiers[i]=new Fichier(DBParams.DBPath+"/F"+i+".df");
        }
    }
    public DiskManager(){
        for(int i =0; i<4; i++){
            fichiers[i]=new Fichier(DBParams.DBPath+"/F"+i+".df");
        }

    } 
    public PageId AllocPage() {
        for(int i=0;i<fichiers.length;i++){
            if(fichiers[i].tailleMax()){

            }else{
                
            }
        }

        return pageId;
    }

    private void newFile(int index){
        try {
                fichier = new Fichier(DBParams.DBPath+"/F"+index+".df"); 
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
