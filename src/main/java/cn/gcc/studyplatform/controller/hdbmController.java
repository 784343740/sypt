package cn.gcc.studyplatform.controller;


import cn.gcc.studyplatform.entity.hdbm;
import cn.gcc.studyplatform.respository.hdbmRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class hdbmController {

    @RequestMapping("/hdbm")
    @ResponseBody
    public List<hdbm> getAll(){
        List<hdbm> users =(List) hdbmRespository.findAll();

        return users;
    }



    @Autowired
    private hdbmRespository hdbmRespository;

    @RequestMapping("/hdbm/xz")
    @ResponseBody
    public hdbm xz(hdbm user){
        hdbmRespository.save(user);

        return user;
    }

}
