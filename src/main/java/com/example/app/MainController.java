package com.example.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root (Model model){
        model.addAttribute("test", "Hello User");
        return "mainTemplate";
    }
}
