package com.example.projeto.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("")
    public String BemVindo() {
        return "Bem-vindo!";

    }
    @GetMapping("/dev")
    public String alberthTailon() {
        return "Alberth Tailon";
    }
    @GetMapping("/curso")
    public String ads() {
        return "Analise Desenvolvimento de Sistema";
    }
}