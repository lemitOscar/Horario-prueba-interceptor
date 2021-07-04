package com.kranki.horarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("titulo", "Bienvenido al horario de atención a clietes");
        return "index";
    }
    @GetMapping("/cerrado")
    public String closehome(){
        return "cerrado";
    }
}
