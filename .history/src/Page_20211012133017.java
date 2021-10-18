public class Page {
    private int id;
    private char [] octets;
    private String nom;
    public Page(int id){
        this.id=id;
        this.nom="Page_"+id;
        for(int i=0; i<DBParams.pageSize;i++){
            octets[i]=' ';
        }
    }
    public Page(int id,String nom){
        this.id = id;
        this.nom = nom;
        for(int i=0; i<DBParams.pageSize;i++){
            octets[i]=' ';
        }
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
