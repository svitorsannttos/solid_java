package com.solid.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Usuario {

    private Long id;
    private String nome;
    private LocalDateTime dataCadastro;

    public Usuario(Long id, String nome){
        this.id = id;
        this.nome = nome;
        this.dataCadastro = LocalDateTime.now();
    }

}
