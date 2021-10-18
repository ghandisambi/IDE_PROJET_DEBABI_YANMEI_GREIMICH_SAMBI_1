import java.io.File;

public class Fichier extends File {
    private String name ;
    private Page [] pages;
    public Fichier (String name){
        super(name);
        this.name=name;

    }
    public Fichier( String name,int nombre_page){
        super(name);
        this.name=name;
        if (nombre_page<DBParams.pageSize){
            for(int i=0;i<nombre_page;i++){
                pages[i]=new Page(i);
            }
        }
        

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

