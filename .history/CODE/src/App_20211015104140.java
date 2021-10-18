public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"+DBParams.maxPagesPerFile);
        Page p = new Page(5);
        System.out.println(p.getNom()+"\t"+p.getSize());
        
    }
}
