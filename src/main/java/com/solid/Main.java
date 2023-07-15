package com.solid;

import com.solid.domain.Pedido;
import com.solid.domain.Produto;
import com.solid.domain.Usuario;
import com.solid.service.PedidoService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Instanciação dos objetos
        Usuario usuario1 = new Usuario(1L, "Vitor");
        Usuario usuario2 = new Usuario(2L, "Santos");
        Produto produto1 = new Produto(1L, "Notebook i5", 2500.00);
        Produto produto2 = new Produto(2L, "Notebook i3", 1500.00);
        Produto produto3 = new Produto(3L, "Notebook i7", 3500.00);
        Pedido pedido1 = new Pedido(1L, usuario1, Arrays.asList(produto1,produto2));
        Pedido pedido2 = new Pedido(2L, usuario2, List.of(produto3));

        //Single Responsability Principle
        PedidoService pedidoService = new PedidoService();
        List<Pedido> pedidos = pedidoService.maiorValor(Arrays.asList(pedido1,pedido2));
        System.out.println("-----------------------------------------------");
        System.out.println("Maiores pedidos: " + pedidos);
        System.out.println("-----------------------------------------------");

    }
}