package com.example.senai.repository;


import com.example.senai.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    // consultar no banco de dados se o e-mail já existe.
    // antes de salvar, atualizar ou deletar um cliente.
    Optional<ClienteEntity> findByEmail(String email);
}
