package com.example.senai.controller;


import com.example.senai.entity.ClienteEntity;
import com.example.senai.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;


    @GetMapping
    public List<ClienteEntity> listarTodosClientes(){
        return service.listatTodos();
    }

    @PostMapping
    ResponseEntity<Map>
}
