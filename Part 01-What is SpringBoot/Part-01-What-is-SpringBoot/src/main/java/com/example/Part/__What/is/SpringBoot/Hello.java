package com.example.Part.__What.is.SpringBoot;


@RestController
public class Hello {

    @RequestMapping("/")
    public String greet() {
        return "Hello World, Welcome to Telusko";
    }
}
