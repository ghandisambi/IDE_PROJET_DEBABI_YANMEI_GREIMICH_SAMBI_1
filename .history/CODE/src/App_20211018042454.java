import java.nio.ByteBuffer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"+DBParams.maxPagesPerFile);
        
        DiskManager ds = new DiskManager();
        PageId p= new PageId(0, 0);
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        
        ByteBuffer [] buffer = new ByteBuffer[5]; 
        p.setFileIdx(0);
        p.setPageIdx(2);
        ds.ReadPage(p, buffer);

        
    
        
    }
}
