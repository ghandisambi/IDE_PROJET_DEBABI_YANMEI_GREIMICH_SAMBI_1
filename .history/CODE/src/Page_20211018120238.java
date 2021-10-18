public class Page {
    private int id;
    private byte[] octets;
    private String nom;
    /** Représente le constructeur de l'objet Page
     * @param id initialisation à l'aide d'un entier qui détermine l'index de la page dans le fichier
     */
    public Page(int id){
        this.id=id;
        this.nom="Page_"+id;
        octets = new byte[DBParams.pageSize];
        
    }
    public Page(int id,String nom){
        this.id = id;
        this.nom = nom;
        octets = new byte[DBParams.pageSize];
    }
    public void reinitialisation(){
        octets = new byte[DBParams.pageSize];
    }
    public byte[] getOctets() {
        return octets;
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
    public void Affichage(){
        int i=0;
        for (Byte oct : octets) {
            
            System.out.println("("+i+")"+oct);
            i++;
        }
    }
    
    


    
}
