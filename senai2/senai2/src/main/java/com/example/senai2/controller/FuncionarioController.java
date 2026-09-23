package com.example.senai2.controller;


import com.example.senai2.entity.FuncionarioEntity;
import com.example.senai2.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public List<FuncionarioEntity> listarTodos(){
        return service.listarTodosFuncionarios();
    }
    @PostMapping
    public ResponseEntity<Map<String, String>> salvar(@RequestBody FuncionarioEntity funcionario){
        service.salvarFuncionario(funcionario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Funcionario cadastrado com sucesso!!"));
    }
}
