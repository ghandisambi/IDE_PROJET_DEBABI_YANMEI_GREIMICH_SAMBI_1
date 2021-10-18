import java.io.File;
import java.util.Vector;

public class DiskManager {
    
    private PageId page;
    private File file;
    

    
    
    public PageId AllocPage() {
        int i=0;
        boolean max = false;
        this.page = new PageId(0, 0) ;
        do{ 
            file = new File(DBParams.DBPath,"/F"+i+".df");
            i++;            
        }while(file.exists());
        if (max = true)newFile(i);
        return new PageId(i, 0);
    }

    private void newFile(int index){
        try {
                file = new File(DBParams.DBPath,"/F"+index+".df"); 
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
