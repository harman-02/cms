package com.example.documentation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @RequestMapping(value = "/hello")
    public String sayhello(){
        return "hello";
    }
}
