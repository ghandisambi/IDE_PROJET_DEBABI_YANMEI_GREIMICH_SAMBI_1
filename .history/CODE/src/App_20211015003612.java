public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"+DBParams.maxPagesPerFile);
        DiskManager dm = new DiskManager(new PageId(0, 1));
        dm.AllocPage();
    }
}
