package com.res.demoauth.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomController {

@GetMapping("/home")
    public String home(Model model){
    model.addAttribute("title","home");
    return "index";
}
}
