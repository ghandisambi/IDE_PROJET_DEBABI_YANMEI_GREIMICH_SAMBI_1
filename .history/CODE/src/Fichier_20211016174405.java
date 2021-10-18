import java.io.File;
import java.util.ArrayList;


public class Fichier extends File {
    private String chemain;
    private ArrayList<Page> pages;

    public Fichier(String chemain){
        super(chemain);
        this.chemain = chemain;
        
    }
    public String getChemain() {
        return chemain;
    }

    
    

}

