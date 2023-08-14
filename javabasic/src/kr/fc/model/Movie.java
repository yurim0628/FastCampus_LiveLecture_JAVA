package kr.fc.model;

// 영화(Object) -> 제목, 이름, 제작사, 가격, 등급, ....
// lombok API
public class Movie {
    // 정보은닉
    private String mtitle;
    private String mname;
    private String mcompany;
    private int mprice;
    private int mlevel;

    public Movie() {
    }

    public Movie(String mtitle, String mname, String mcompany, int mprice, int mlevel) {
        this.mtitle = mtitle;
        this.mname = mname;
        this.mcompany = mcompany;
        this.mprice = mprice;
        this.mlevel = mlevel;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMcompany() {
        return mcompany;
    }

    public void setMcompany(String mcompany) {
        this.mcompany = mcompany;
    }

    public int getMprice() {
        return mprice;
    }

    public void setMprice(int mprice) {
        this.mprice = mprice;
    }

    public int getMlevel() {
        return mlevel;
    }

    public void setMlevel(int mlevel) {
        this.mlevel = mlevel;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "mtitle='" + mtitle + '\'' +
                ", mname='" + mname + '\'' +
                ", mcompany='" + mcompany + '\'' +
                ", mprice=" + mprice +
                ", mlevel=" + mlevel +
                '}';
    }
}
