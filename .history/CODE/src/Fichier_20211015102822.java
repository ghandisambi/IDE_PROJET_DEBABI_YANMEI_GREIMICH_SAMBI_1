import java.io.File;


public class Fichier extends File {
    private String name ;
    private Page [] pages;
    private int index;
    
    public Fichier( String path,String name,int index,String extention,int nombre_page){
        super(path+name+index+extention);
        this.name=path+name+index+extention;
        this.index= index;
        if (nombre_page<DBParams.maxPagesPerFile){
            for(int i=0;i<nombre_page;i++){
                pages[i]=new Page(i);
            }
        }
        else{
            System.out.println("le nombre de page est supérieur");
        }
    }
    public Fichier(String path,String name,int index,String extention){
        super(path+name+index+extention);
        this.name=path+name+index+extention;
        this.index=index;

    }
    public Boolean ajoutePage(){
        
        if(pages.length==DBParams.maxPagesPerFile){
            return false;
        }
        else{
            int i=pages.length;
            pages[i++] = new Page(i++);
            return true;
        }
        
    }

    public String getName(){
        return name;
    }
    public boolean tailleMax(){
        if (pages.length* DBParams.pageSize == 3*DBParams.pageSize){
            return true ;
        }else { 
            return false;
        }
        
    }
    public int getIndex() {
        return index;
    }
    public Page[] getPages() {
        return pages;
    }

}

