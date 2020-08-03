package cn.gcc.studyplatform.controller;


import cn.gcc.studyplatform.entity.xsd;
import cn.gcc.studyplatform.respository.xsdRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class xsdController {

    @RequestMapping("/xsd")
    @ResponseBody
    public List<xsd> getAll(){
        List<xsd> users =(List) xsdRespository.findAll();

        return users;
    }



    @Autowired
    private xsdRespository xsdRespository;


}
