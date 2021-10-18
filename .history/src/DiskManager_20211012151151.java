import java.io.File;
import java.util.Vector;

public class DiskManager {
    
    private PageId pageId;
    private Vector <Fichier> listFichiers;
    private Fichier fichier;

    public DiskManager(PageId pageId){
        this.pageId = pageId;
        listFichiers= new Vector<>();
        for(int i = 0; i<4;i++){
            listFichiers.add(new Fichier(DBParams.DBPath,"/F",i,".df"));
        }
    }
    public DiskManager(){
        listFichiers= new Vector<>();
        for(int i =0; i<4; i++){
            listFichiers.add(new Fichier(DBParams.DBPath,"/F",i,".df"));
        }

    } 
    public PageId AllocPage() {
        boolean dernierFichier = false;
        for (Fichier fichier : listFichiers) {
            if(fichier.tailleMax()){
                if(fichier.getIndex()==listFichiers.size()-1){
                    dernierFichier=true;
                }
            }else{
                fichier.ajoutePage();
            }   
        }
        if(dernierFichier)nouveauFichier(listFichiers.size()+1);
        return pageId;
    }

    private Fichier nouveauFichier(int index){
        return new Fichier(DBParams.DBPath,"/F",index,".df");
    }
    public PageId ReadPage() {
        return new PageId(0, 0);
    }
    public PageId WritePage(){
        return new PageId(0,0);
    }


}
