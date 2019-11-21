
public class assetTable {
      private int assetid;
    private String assetname;
    private String assetmark;
    private String assetmodel;
    private int assetpiece;
    
    public assetTable(int assetid, String assetname, String assetmark, String assetmodel, int assetpiece) {
         this.assetid = assetid;
        this.assetname = assetname;
        this.assetmark = assetmark;
        this.assetmodel = assetmodel;
        this.assetpiece = assetpiece;
    }
    
    public int getAssetid() {
        return assetid;
    }

    public void setAssetid(int assetid) {
        this.assetid = assetid;
    }

    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname;
    }

    public String getAssetmark() {
        return assetmark;
    }

    public void setAssetmark(String assetmark) {
        this.assetmark = assetmark;
    }

    public String getAssetmodel() {
        return assetmodel;
    }

    public void setAssetmodel(String assetmodel) {
        this.assetmodel = assetmodel;
    }

    public int getAssetpiece() {
        return assetpiece;
    }

    public void setAssetpiece(int assetpiece) {
        this.assetpiece = assetpiece;
    }
}

