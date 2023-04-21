package com.example.Banking.Project.users;


import org.hibernate.validator.constraints.ModCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;
    @GetMapping("/users")
    public String getAllUsers(Model model){
        List<Users> users=usersService.getAllUsers();
        model.addAttribute("alluserlist",users);
        model.addAttribute("template","users.html");
//        model.addAttribute("style","users.css");
        model.addAttribute("title","User");
        return "component";
    }

    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("template","home.html");
        model.addAttribute("title","Home");
        return "component";
    }
    @GetMapping("/sample")
    public String getSample(){
        return "sample";
    }

}
