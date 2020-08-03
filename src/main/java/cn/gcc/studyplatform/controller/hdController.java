package cn.gcc.studyplatform.controller;


import cn.gcc.studyplatform.entity.hd;
import cn.gcc.studyplatform.respository.hdRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class hdController {

    @RequestMapping("/hd")
    @ResponseBody
    public List<hd> getAll(){
        List<hd> users =(List) hdRespository.findAll();

        return users;
    }



    @Autowired
    private hdRespository hdRespository;



}
