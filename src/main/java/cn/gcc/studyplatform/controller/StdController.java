package cn.gcc.studyplatform.controller;


import cn.gcc.studyplatform.entity.std;
import cn.gcc.studyplatform.respository.stdRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StdController {

    @RequestMapping("/std")
    @ResponseBody
    public List<std> getAll(){
        List<std> users =(List) stdRespository.findAll();

        return users;
    }

//    @RequestMapping("/users/delete")
//    @ResponseBody
//    public void deleteById(int id){
//
//        stdRespository.deleteById(id);
//
//    }

    @Autowired
    private stdRespository stdRespository;

//    @RequestMapping("/users/create")
//    @ResponseBody
//    public std create(std user){
//
//        stdRespository.save(user);
//
//        return user;
//    }
//
//    @RequestMapping("/users/xz")
//    @ResponseBody
//    public std xz(std user){
//        stdRespository.save(user);
//
//        return user;
//    }
}
