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
    public void setFileIdx(int Fidx) {
        this.fileIdx = Fidx;
    }
    public void setFileIdx(int Pidx) {
        this.PageIdx = Pidx;
    }

}
