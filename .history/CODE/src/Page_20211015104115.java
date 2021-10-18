public class Page {
    private int id;
    private Byte[] octets;
    private String nom;
    public Page(int id){
        this.id=id;
        this.nom="Page_"+id;
        octets = new Byte[DBParams.pageSize];
        
    }
    public Page(int id,String nom){
        this.id = id;
        this.nom = nom;
        octets = new Byte[DBParams.pageSize];
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
