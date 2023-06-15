package com.example.EarthFairyTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("https://csumin0825.github.io/Earth-fairy-Test/")
    public String mainView(){
        return ("main");
    }

    @GetMapping("/introduce")
    public String introduceView(){
        return ("introduce");
    }
}
