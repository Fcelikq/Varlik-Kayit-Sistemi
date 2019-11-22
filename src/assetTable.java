
public class assetTable {
      private int assetid;
    private String assetname;
    private String assetmark;
    private String assetmodel;
    private String assetdepartment;
    private String assetuser;
    
    public assetTable(int assetid, String assetname, String assetmark, String assetmodel, String assetdepartment,String assetuser) {
         this.assetid = assetid;
        this.assetname = assetname;
        this.assetmark = assetmark;
        this.assetmodel = assetmodel;
        this.assetdepartment = assetdepartment;
          this.assetuser = assetuser;
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

    public String getAssetdepartment() {
        return assetdepartment;
    }

    public void setAssetdepartment(String assetdepartment) {
        this.assetdepartment = assetdepartment;
    }
      public String getAssetuser() {
        return assetuser;
    }

    public void setAssetuser(String assetuser) {
        this.assetuser = assetuser;
    }
}

