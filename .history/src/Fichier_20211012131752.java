import java.io.File;

public class Fichier extends File {
    private String name ;
    private Page page;
    public Fichier (String name){
        super(name);
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

