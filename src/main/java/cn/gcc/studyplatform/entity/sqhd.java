//package cn.gcc.studyplatform.entity;
//
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.time.LocalDate;
//
//@Entity
//public class sqhd {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int stid;
//
//    private String stname;
//    private String hdname;
//    private String title;
//    private String hdtime;
//    private String where;
//
//
//    public sqhd() {
//    }
//
//    public int getStid() {
//        return stid;
//    }
//
//    public void setStid(int stid) {
//        this.stid = stid;
//    }
//
//    public String getStname() {
//        return stname;
//    }
//
//    public void setStname(String stname) {
//        this.stname = stname;
//    }
//
//    public String getHdname() {
//        return hdname;
//    }
//
//    public void setHdname(String hdname) {
//        this.hdname = hdname;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getHdtime() {
//        return hdtime;
//    }
//
//    public void setHdtime(String hdtime) {
//        this.hdtime = hdtime;
//    }
//
//    public String getWhere() {
//        return where;
//    }
//
//    public void setWhere(String where) {
//        this.where = where;
//    }
//
//    public sqhd(String stname, String hdname, String title, String hdtime, String where) {
//        this.stname = stname;
//        this.hdname = hdname;
//        this.title = title;
//        this.hdtime = hdtime;
//        this.where = where;
//    }
//}
