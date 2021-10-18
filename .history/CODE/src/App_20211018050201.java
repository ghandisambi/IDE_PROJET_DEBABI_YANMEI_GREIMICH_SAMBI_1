import java.nio.ByteBuffer;

public class App {
    public static void main(String[] args) throws Exception {
        
        
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
        p.setFileIdx(0);
        p.setPageIdx(1);
        System.out.println("--------------------********* Lecture du fichier:"+ds.getListFichiers().get(0)+" *********-----------------------");
        ds.ReadPage(p, buffer);
        System.out.println("\n_________________________________________________ Fin lecture _________________________________________________");
        System.out.println("\nTaille du fichier en nombre de caractère:"+ds.getListFichiers().get(0).length()+"\n");

        p=ds.AllocPage();
        System.out.println("le fichier d'index:"+p.getFileIdx()+" contient la page d'index:"+p.getPageIdx());
        

        
    
        
    }
}
