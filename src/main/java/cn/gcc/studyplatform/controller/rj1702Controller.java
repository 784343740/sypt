package cn.gcc.studyplatform.controller;

import cn.gcc.studyplatform.entity.软件1702;
import cn.gcc.studyplatform.respository.rj1702Respository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class rj1702Controller {

    @RequestMapping("/rj1702")
    @ResponseBody
    public List<软件1702> getAll(){
        List<软件1702> kcb =(List)rj1702Respository.findAll();

        return kcb;
    }

    @Autowired
    private rj1702Respository rj1702Respository;

}
