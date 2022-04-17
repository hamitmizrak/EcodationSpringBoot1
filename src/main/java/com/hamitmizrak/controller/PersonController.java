package com.hamitmizrak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonController {


    // http://localhost:8080/responsenonhtml
    //1-) bir sayfa olmadan göstermek
    @GetMapping("responsenonhtml")
    @ResponseBody
    public String responseNonHtmlMethod(){
        return "sayfa olmadan gösterildim";
    }

    // http://localhost:8080/thymeleaf1
    @GetMapping("thymeleaf1")
    public String thymeleaf1(){
        return "thymeleaf1";
    }

}
