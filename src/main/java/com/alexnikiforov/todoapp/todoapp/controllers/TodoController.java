package com.alexnikiforov.todoapp.todoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping
    public String index() {
        return "index";
    }
}
