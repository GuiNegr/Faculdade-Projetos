package com.TaskList.TaskList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskController {

    @RequestMapping("/Cadastro")
    public String form(){
        return "TaskView/Cadastro";
    }
}
