import java.io.File;


public class Fichier extends File {

    public Fichier(File parent, String child) {
        super(parent, child);
        
    }
    public Fichier(String chemain){
        super(chemain);
    }
    
    

}

