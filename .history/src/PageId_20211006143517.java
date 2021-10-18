public class PageId {
    private int fileIdx,pageIdx;
    public PageId(int pageIdx,int FileIdx){
        this.pageIdx = pageIdx;
        this.fileIdx = fileIdx;
    }
    public int getFileIdx() {
        return fileIdx;
    }
    public int getPageIdx() {
        return pageIdx;
    }
}
