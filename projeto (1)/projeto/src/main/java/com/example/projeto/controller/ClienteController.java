package com.example.projeto.controller;

import com.example.projeto.entity.ClienteEntity;
import com.example.projeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<ClienteEntity> listartodos() {
        return repository.findAll();

    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody ClienteEntity cliente) {
        repository.save(cliente);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "funcionario salvo com sucesso"));
    }
}