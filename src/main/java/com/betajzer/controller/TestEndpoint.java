package com.betajzer.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class TestEndpoint {

    @GetMapping()
    public String getHello(){
        return "Hello test";
    }

    @PostMapping()
    public String hello(@RequestBody String body){
        return body;
    }
}
