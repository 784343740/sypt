//package cn.gcc.studyplatform.controller;
//
//
//import cn.gcc.studyplatform.entity.sqhd;
//import cn.gcc.studyplatform.respository.sqhdRespository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//public class sqhdController {
//
//    @RequestMapping("/sqhd")
//    @ResponseBody
//    public List<sqhd> getAll(){
//        List<sqhd> users =(List) sqhdRespository.findAll();
//
//        return users;
//    }
//
//    @Autowired
//    private sqhdRespository sqhdRespository;
//
//}
