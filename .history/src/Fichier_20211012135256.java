import java.io.File;
import java.util.Scanner;

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
        if (nombre_page<DBParams.maxPagesPerFile){
            for(int i=0;i<nombre_page;i++){
                pages[i]=new Page(i);
            }
        }
        else{
            System.out.println("le nombre de page est supérieur");
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean tailleMax(){
        return (pages.length*DBParams.pageSize==3*DBParams.pageSize?true:false);
    }

}

