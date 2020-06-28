package com.gb.ee.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    // root (context path) = http://localhost:8189/app

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }
}
