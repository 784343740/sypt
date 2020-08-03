package cn.gcc.studyplatform.springsecurity;

import cn.gcc.studyplatform.entity.std;
import cn.gcc.studyplatform.entity.xsd;
//import cn.gcc.studyplatform.entity.xxda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class securitycon extends WebSecurityConfigurerAdapter {

    @Autowired
    private cn.gcc.studyplatform.respository.xsdRespository xsdRespository;

    @Autowired
    private cn.gcc.studyplatform.respository.stdRespository stdRespository;

//    @Autowired
//    private cn.gcc.studyplatform.respository.stdRespository xxdaRespository;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {


        List<xsd> users1 =(List) xsdRespository.findAll();
        List<std> users2 =(List) stdRespository.findAll();

        for (int i = 0; i <users1.size() ; i++) {
            System.out.println(users1.size());
            auth.inMemoryAuthentication().withUser(users1.get(i).getXsname()).password(users1.get(i).getPassword()).authorities("student");

        }
        for (int i = 0; i <users2.size() ; i++) {
            System.out.println(users2.size());
            auth.inMemoryAuthentication().withUser(users2.get(i).getStname()).password(users2.get(i).getPasswd()).authorities("std");

        }
        auth.inMemoryAuthentication().withUser("李书记").password("123456").authorities("xxd");
        auth.inMemoryAuthentication().withUser("温书记").password("123456").authorities("xxd");

//        for (int i = 0; i <users3.size() ; i++) {
//            System.out.println(users3.size());
//            auth.inMemoryAuthentication().withUser(users3.get(i).getName()).password(users3.get(i).getPasswd()).authorities("xxda");
//
//        }

    }

            @Override
            protected void configure(HttpSecurity http) throws Exception {

                http.authorizeRequests()
                        .antMatchers("/xsd.html").hasAnyAuthority("student")
                        .antMatchers("/index2.html").hasAnyAuthority("std")
                        .antMatchers("/index3.html").hasAnyAuthority("xxd")

                        .antMatchers("/**").fullyAuthenticated().and().formLogin();



    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder(){
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }




}
