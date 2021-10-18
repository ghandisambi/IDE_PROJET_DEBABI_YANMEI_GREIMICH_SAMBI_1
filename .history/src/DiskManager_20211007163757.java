import java.io.File;
import java.util.Vector;

public class DiskManager {
    
    private PageId page;
    private File f;
    

    
    
    public PageId AllocPage() {
        int i=0;
        this.page = new PageId(0, 0) ;
        do{
            f = new File(DBParams.DBPath,"F"+i+".df");
            

        }while(f.exists());
        

        return new PageId(0, 0);
    }
    public void newPage(){
    }
    public PageId ReadPage() {
        return new PageId(0, 0);
    }
    public PageId WritePage(){
        return new PageId(0,0);
    }


}
