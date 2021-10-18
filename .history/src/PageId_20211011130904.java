public class PageId {
    private int fileIdx,pageIdx;
    public PageId(int fileIdx, int pageIdx) {
        this.fileIdx = fileIdx;
        this.pageIdx = pageIdx;
    }
    public int getFileIdx() {
        return fileIdx;
    }
    public int getPageIdx() {
        return pageIdx;
    }
    public void setFileIdx(int fileIdx) {
        this.fileIdx = fileIdx;
    }
    public void setPageIdx(int pageIdx) {
        this.pageIdx = pageIdx;
    }
    

}
