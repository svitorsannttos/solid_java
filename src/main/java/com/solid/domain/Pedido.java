package com.solid.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class Pedido {

    private Long id;
    private Usuario usuario;
    private List<Produto> produtos;
    private Double valorTotal = 0.0;

    public Pedido(Long id, Usuario usuario, List<Produto> produtos) {
        this.id = id;
        this.usuario = usuario;
        this.produtos = produtos;
        for (Produto produto : produtos){
            this.valorTotal+=produto.getValor();
        }
    }
}
