package cn.gcc.studyplatform.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class std {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stid;

    private String stname;
    private String cltime;
    private String jj;
    private String role;
    private String status;
    private String passwd;
    int rs;

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public std() {
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

    public String getCltime() {
        return cltime;
    }

    public void setCltime(String cltime) {
        this.cltime = cltime;
    }

    public String getJj() {
        return jj;
    }

    public void setJj(String jj) {
        this.jj = jj;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRs() {
        return rs;
    }

    public void setRs(int rs) {
        this.rs = rs;
    }

    public std(String stname, String cltime, String jj, String role, String status, int rs,String passwd) {
        this.stname = stname;
        this.cltime = cltime;
        this.jj = jj;
        this.role = role;
        this.status = status;
        this.rs = rs;
        this.passwd=passwd;
    }
}
