package com.aleksandrov.bootci;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String main(){
        return "index";
    }

    @GetMapping("admin")
    public String main2(){
        return "index";
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }
}
