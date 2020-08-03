package cn.gcc.studyplatform.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class xsd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int xsid;
    private long tel;

    private String xsname;
    private String njzy;
    private String password;


    public xsd() {
    }

    public xsd(long tel, String xsname, String njzy, String password) {
        this.tel = tel;
        this.xsname = xsname;
        this.njzy = njzy;
        this.password = password;
    }

    public int getXsid() {
        return xsid;
    }

    public void setXsid(int xsid) {
        this.xsid = xsid;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getXsname() {
        return xsname;
    }

    public void setXsname(String xsname) {
        this.xsname = xsname;
    }

    public String getNjzy() {
        return njzy;
    }

    public void setNjzy(String njzy) {
        this.njzy = njzy;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
