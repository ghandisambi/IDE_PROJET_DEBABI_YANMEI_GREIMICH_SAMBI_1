import java.io.File;

public class DiskManager {
    
    private PageId page;
    private File f;

    public DiskManager(){
        PageId page = new PageId(0, 0) ;
        
        

    }
    
    public PageId AllocPage() {

        return new PageId(0, 0);
    }
    public PageId ReadPage() {
        return new PageId(0, 0);
    }
    public PageId WritePage(){
        return new PageId(0,0);
    }


}
