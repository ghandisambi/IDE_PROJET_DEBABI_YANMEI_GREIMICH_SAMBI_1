public class Page {
    private int id;
    private Byte[] octets;
    private String nom;
    public Page(int id){
        this.id=id;
        this.nom="Page_"+id;
        
    }
    public Page(int id,String nom){
        this.id = id;
        this.nom = nom;
    }
    public int getId() {
        return id;
    }
    public int getSize(){
        return octets.length;
    }
    public String getNom() {
        return nom;
    }
    
    


    
}
