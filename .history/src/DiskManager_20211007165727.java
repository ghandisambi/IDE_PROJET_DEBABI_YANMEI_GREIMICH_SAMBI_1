import java.io.File;
import java.util.Vector;

public class DiskManager {
    
    private PageId page;
    private File file;
    

    
    
    public PageId AllocPage() {
        int i=0;
        this.page = new PageId(0, 0) ;
        do{
            file = new File(DBParams.DBPath,"/F"+i+".df");
            i++;            
        }while(file.exists());
        
        try {
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("The new file is created.");
            }else {
                System.out.println("The file already exists.");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
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
