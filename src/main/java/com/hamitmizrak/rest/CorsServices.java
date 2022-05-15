package com.hamitmizrak.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CorsServices {

    //Cors.html:1 Access to XMLHttpRequest at 'http://localhost:8080/cors' from origin 'http://127.0.0.1:5500'
    // has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource.

    //http://localhost:8080/cors
    @GetMapping("/cors")
    public String message(){
        return "Merhabalar CORS dünyası";
    }
}
