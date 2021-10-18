public class Page {
    private int id;
    private char [] octets;
    public Page(int id){
        this.id=id;
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
    
    


    
}
