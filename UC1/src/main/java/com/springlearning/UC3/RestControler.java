package com.springlearning.UC3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControler {
    @GetMapping("/create")
    public String index(){
        return  "Hello From BridgeLabz";
    }
}
