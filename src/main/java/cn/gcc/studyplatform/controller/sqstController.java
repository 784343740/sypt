//package cn.gcc.studyplatform.controller;
//
//
//import cn.gcc.studyplatform.entity.sqst;
//import cn.gcc.studyplatform.respository.sqstRespository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//public class sqstController {
//
//    @RequestMapping("/sqst")
//    @ResponseBody
//    public List<sqst> getAll(){
//        List<sqst> users =(List) sqstRespository.findAll();
//
//        return users;
//    }
//
//
//
//    @Autowired
//    private sqstRespository sqstRespository;
//
//
//}
