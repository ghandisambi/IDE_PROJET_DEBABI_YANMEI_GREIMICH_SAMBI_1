import java.io.File;
import java.util.StringTokenizer;
import java.util.Vector;


public class Fichier extends File {
    private String chemain;
    private Vector<Page> pages;
    private int nbPage;
    private int fileIdx;
    

    public Fichier(String chemain){
        super(chemain);
        this.chemain = chemain;
        nbPage=0;
        pages = new Vector<>();
        StringTokenizer st = new StringTokenizer(chemain,"./BD"+"df"+"F");
        int a= Integer.parseInt(st.nextToken()) ;
        fileIdx=a;

        
    }
    
    /** 
     * Permet d'ajouter une page au fichier si il y a de la place
     * @return boolean vrai si la page a été ajouter sinon faux car fichier plein
     */
    public boolean addPages(){
        nbPage=pages.size();
        if(pages.size()<3){
            pages.add(new Page(nbPage+1));
            System.out.println("page_"+(nbPage+1)+" ajoutée au fichier "+getChemain());
            return true;
        }else{
            System.out.println("Vous ne pouvais plus rajouter de pages");
            return false;
        }
    }
    
    /** 
     * Test si le fichier est plein 
     * c'est-à-dire que le nombre de pages est égal à 3 
     * @return boolean vrai si le nombre de page est égal à 3, faux si inférieur à 3
     */
    public boolean estPlein(){
        return (pages.size()==3?true:false);
    }
    
    /** 
     * Permet de prendre la première page du fichier
     * @param pageId 
     * @return Page la première page
     */
    public Page getPageFirst(int pageId){  
            return pages.firstElement();
    }
    /** 
     * Permet de prendre la dernière page du fichier
     * @param pageId 
     * @return Page la dernière page
     */
    public Page getPageLast(int pageId){  
        return pages.lastElement();
    }

    
    /** 
     * @return String le chemain et le nom du fichier 
     */
    public String getChemain(){
        return chemain;
    }
    
    /** 
     * @return int l'index de la dernière page du fichier
     */
    public int getIdPage(){
        return pages.lastElement().getId();
    }
    
    /** 
     * @return int l'index du fichier
     */
    public int getFileIdx() {
        return fileIdx;
    }
    

    
    

}

