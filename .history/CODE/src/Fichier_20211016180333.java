import java.io.File;
import java.util.LinkedList;
import java.util.List;


public class Fichier extends File {
    private String chemain;
    private List<Page> pages;
    private int nbPage;

    public Fichier(String chemain){
        super(chemain);
        this.chemain = chemain;
        nbPage=0;
        pages = new LinkedList<>();
    }
    public boolean addPages(){
        nbPage=pages.size();
        if(pages.size()<3  ){
            pages.add(new Page(nbPage+1));
            return true;
        }else{
            System.out.println("Vous ne pouvais plus rajouter de pages");
            return false;
        }
        
    }
    public String getChemain(){
        return chemain;
    }

    
    

}

