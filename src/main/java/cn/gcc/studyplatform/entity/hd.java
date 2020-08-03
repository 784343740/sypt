package cn.gcc.studyplatform.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class hd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int stid;

    private String stname;
    private String hdname;
    private String title;
    private String hdtime;
    private String where;
    private int js;

    public hd() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHdtime() {
        return hdtime;
    }

    public void setHdtime(String hdtime) {
        this.hdtime = hdtime;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public int getJs() {
        return js;
    }

    public void setJs(int js) {
        this.js = js;
    }

    public hd(long id,String stname, String hdname, String title, String hdtime, String where, int js) {
        this.id=id;
        this.stname = stname;
        this.hdname = hdname;
        this.title = title;
        this.hdtime = hdtime;
        this.where = where;
        this.js = js;
    }
}
