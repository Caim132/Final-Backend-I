package com.example.meuprojeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NomeController {

    @GetMapping("/nome")
    public String getNome() {
        return "Vinicius"; // Substitua "Seu Nome" pelo seu nome real
    }
}
