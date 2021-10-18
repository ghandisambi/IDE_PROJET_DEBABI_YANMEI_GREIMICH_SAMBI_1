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
    /** 
     * Représente un second constructeur de l'objet Page avec plus de paramètre
     * @param id initialisation à l'aide d'un entier qui détermine l'index de la page dans le fichier
     * @param nom permet de renommer la page 
     */
    public Page(int id,String nom){
        this.id = id;
        this.nom = nom;
        octets = new byte[DBParams.pageSize];
    }
    /**
     * Réinitialisation du tableau d'octet 
     */
    public void reinitialisation(){
        octets = new byte[DBParams.pageSize];
    }
    /**
     *  renvoie le tableau d'octet de la page 
     *  @return Un tableau d'octet
     */
    public byte[] getOctets() {
        return octets;
    }
    
    
    /** 
     * @return int
     */
    public int getId() {
        return id;
    }
    
    /** 
     * @return int
     */
    public int getSize(){
        return octets.length;
    }
    
    /** 
     * @return String
     */
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
