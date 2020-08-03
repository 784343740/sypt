package cn.gcc.studyplatform.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class hdpeople {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long xsid;
    private String xsname;
    private String y;
    private String njzy;
    private long tel;
    private int stid;
    private String stname;
    private String hdname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public hdpeople() {
    }

    public hdpeople(long id,String xsname, String y, String njzy, long tel, int stid, String stname, String hdname) {
        this.id=id;
        this.xsname = xsname;
        this.y = y;
        this.njzy = njzy;
        this.tel = tel;
        this.stid = stid;
        this.stname = stname;
        this.hdname = hdname;
    }

    public long getXsid() {
        return xsid;
    }

    public void setXsid(long xsid) {
        this.xsid = xsid;
    }

    public String getXsname() {
        return xsname;
    }

    public void setXsname(String xsname) {
        this.xsname = xsname;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getNjzy() {
        return njzy;
    }

    public void setNjzy(String njzy) {
        this.njzy = njzy;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public String getHdname() {
        return hdname;
    }

    public void setHdname(String hdname) {
        this.hdname = hdname;
    }
}
