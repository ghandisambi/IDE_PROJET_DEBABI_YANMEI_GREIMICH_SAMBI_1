import java.io.File;
import java.util.LinkedList;
import java.util.List;


public class Fichier extends File {
    private String chemain;
    private List<Page> pages = new LinkedList<>();

    public Fichier(String chemain){
        super(chemain);
        this.chemain = chemain;
        
    }
    public String getChemain() {
        return chemain;
    }

    
    

}

