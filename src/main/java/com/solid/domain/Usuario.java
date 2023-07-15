package com.solid.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Usuario {

    private Long id;
    private String nome;
    private LocalDateTime dataCadastro;
    private TipoPessoa tipoPessoa;

    public Usuario(Long id, String nome, TipoPessoa tipoPessoa){
        this.id = id;
        this.nome = nome;
        this.dataCadastro = LocalDateTime.now();
        this.tipoPessoa = tipoPessoa;
    }

}
