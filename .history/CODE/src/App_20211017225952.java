
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"+DBParams.maxPagesPerFile);
        
        DiskManager ds = new DiskManager();
        ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();
        ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();
        ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();
        ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();ds.AllocPage();
        PageId p= new PageId(0, 0);
        p=ds.AllocPage();
        System.out.println(p.getFileIdx()+"et"+p.getPageIdx());

        
    
        
    }
}
