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
        
        ByteBuffer [] buffer = new ByteBuffer[5]; 
        p.setFileIdx(1);
        p.setPageIdx(1);
        System.out.println("_______________________________________-------------********* Lecture du fichier *********------------___________________________");
        ds.ReadPage(p, buffer);
        System.out.println("_______________________________________________________________ Fin ____________________________________________________________________________");
        System.out.println("\nTaille du fichier en nombre de caractère:"+ds.getListFichiers().get(1).length()+"\n");

        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        

        
    
        
    }
}
