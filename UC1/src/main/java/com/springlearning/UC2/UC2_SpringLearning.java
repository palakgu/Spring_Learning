package com.springlearning.UC2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UC2_SpringLearning {
    @GetMapping("/web")
    public String helloweb(){
        return "hello";
    }
    @GetMapping("/web/message")
    public String messageweb(Model model){
        model.addAttribute("message"," This is custom message");
        return "message";
    }
            
}
