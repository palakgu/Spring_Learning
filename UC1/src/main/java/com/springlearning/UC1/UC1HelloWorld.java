package com.springlearning.UC1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UC1HelloWorld {
    @GetMapping("/hello")
    public String hello(){
        return  "Hello World From Bridgelabz";
    }
}
