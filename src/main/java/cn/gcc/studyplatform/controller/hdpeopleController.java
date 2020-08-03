package cn.gcc.studyplatform.controller;


import cn.gcc.studyplatform.entity.hdpeople;
import cn.gcc.studyplatform.respository.hdpeopleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class hdpeopleController {

    @RequestMapping("/hdpeople")
    @ResponseBody
    public List<hdpeople> getAll(){
        List<hdpeople> users =(List) hdpeopleRespository.findAll();

        return users;
    }


    @Autowired
    private hdpeopleRespository hdpeopleRespository;


}
