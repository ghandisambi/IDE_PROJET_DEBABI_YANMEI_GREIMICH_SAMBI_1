import java.nio.ByteBuffer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"+DBParams.maxPagesPerFile);
        
        DiskManager ds = new DiskManager();
        PageId p= new PageId(0, 0);
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());
        ByteBuffer [] buffer = new ByteBuffer[5]; 
        ds.ReadPage(p, buffer);

        
    
        
    }
}
