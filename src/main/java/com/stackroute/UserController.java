package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UserController {

    @Autowired
    User user;

    @RequestMapping(value = "/")
    public ModelAndView greet(){
        ModelAndView modelAndView = new ModelAndView("index.jsp");
        modelAndView.addObject("result","Welcome to stackroute "+user.getName());
        return modelAndView;
    }
}