package cn.gcc.studyplatform.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class hdbm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long xsid;

    private String xsname;
    private String y;
    private String njzy;
    private long tel;
    private String hdname;


    public hdbm() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getHdname() {
        return hdname;
    }

    public void setHdname(String hdname) {
        this.hdname = hdname;
    }

    public hdbm(long id,String xsname, String y, String njzy, long tel, String hdname) {
        this.id=id;
        this.xsname = xsname;
        this.y = y;
        this.njzy = njzy;
        this.tel = tel;
        this.hdname = hdname;
    }
}
