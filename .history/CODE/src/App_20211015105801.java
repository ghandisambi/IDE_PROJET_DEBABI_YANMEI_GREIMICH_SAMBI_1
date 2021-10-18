import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"+DBParams.maxPagesPerFile);
        File f = new File(DBParams.DBPath,"FO.txt" );
        System.out.println(f.getName()+"\n"+f.getAbsolutePath());
    
        
    }
}
