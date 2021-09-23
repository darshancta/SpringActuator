package com.example.contollrer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String test(){
        return "test";
    }

    @GetMapping("/example")
    public String example() {
        return "Hello User !! " + new Date();
    }
}
