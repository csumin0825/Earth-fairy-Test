package com.example.EarthFairyTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("main")
    public String mainView(){
        return ("main");
    }

    @GetMapping("/introduce")
    public String introduceView(){
        return ("introduce");
    }
}
