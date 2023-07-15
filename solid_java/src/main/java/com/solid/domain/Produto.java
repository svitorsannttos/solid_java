package com.solid.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {

    private Long id;
    private String nome;
    private Double valor;

}
