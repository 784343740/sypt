package cn.gcc.studyplatform.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//annotation 注解
@Controller
public class LoginController {


    @RequestMapping("/login")
    public String login(String username,String password){


        return "success";
    }
}
