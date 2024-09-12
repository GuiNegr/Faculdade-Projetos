package com.EstudoSpring.EstudoSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {

    @GetMapping("/Cadastro")
    public String pageCadastro(){
        return "cadastro";
    }



}
