package com.example.senai2.service;

import com.example.senai2.entity.FuncionarioEntity;
import com.example.senai2.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    // GET
    public List<FuncionarioEntity> listarTodosFuncionarios(){
        return repository.findAll();
    }
    // POST
    public FuncionarioEntity salvarFuncionario(FuncionarioEntity funcionario) {
        if (repository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Funcionario já cadastrado.");
        }
        // caso não esteja cadastrado, será cadastrado agora.
        return repository.save(funcionario);
    }
}
