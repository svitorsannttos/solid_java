package com.solid;

import com.solid.domain.*;
import com.solid.service.PedidoService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Instanciação dos objetos
        Usuario usuario1 = new Usuario(1L, "Vitor", TipoPessoa.PESSOA_FISICA);
        Usuario usuario2 = new Usuario(2L, "Santos", TipoPessoa.PESSOA_FISICA);
        Usuario usuario3 = new Usuario(3L, "Inovam", TipoPessoa.PESSOA_JURIDICA);
        Usuario usuario4 = new Usuario(4L, "SM", TipoPessoa.PESSOA_JURIDICA);
        Usuario usuario5 = new Usuario(5L, "Fiserv", TipoPessoa.PESSOA_JURIDICA);

        Produto produto1 = new Produto(1L, "Notebook i5", 2500.00);
        Produto produto2 = new Produto(2L, "Notebook i3", 1500.00);
        Produto produto3 = new Produto(3L, "Notebook i7", 3500.00);

        Pedido pedido1 = new Pedido(1L, usuario1, List.of(produto1,produto2));
        Pedido pedido2 = new Pedido(2L, usuario2, List.of(produto3, produto1, produto3, produto2));
        Pedido pedido3 = new Pedido(3L, usuario2, List.of(produto3));
        Pedido pedido4 = new Pedido(4L, usuario3, List.of(produto3, produto1, produto1, produto1));
        Pedido pedido5 = new Pedido(5L, usuario4, List.of(produto3, produto1));
        Pedido pedido6 = new Pedido(6L, usuario5, List.of(produto3, produto1, produto3));
        Pedido pedido7 = new Pedido(7L, usuario5, List.of(produto1));
        Pedido pedido8 = new Pedido(8L, usuario2, List.of(produto2));


        PedidoService pedidoService = new PedidoService();

        //Single Responsability Principle
        List<Pedido> pedidos = pedidoService.maiorValor(Arrays.asList(pedido1,pedido2,pedido3,pedido4,pedido5,pedido6,pedido7,pedido8));
        System.out.println("-----------------------------------------------");
        System.out.println("Maiores pedidos: " + pedidos);
        System.out.println("-----------------------------------------------");

        //Open Closed Principle
        List<Pedido> pedidosPessoaFisica = pedidoService.maiorValorPessoaFisica(Arrays.asList(pedido1,pedido2,pedido3,pedido4,pedido5,pedido6,pedido7,pedido8));
        System.out.println("-----------------------------------------------");
        System.out.println("Maiores pedidos de pessoas fisicas: " + pedidosPessoaFisica);
        System.out.println("-----------------------------------------------");

        List<Pedido> pedidosPessoaJuridica = pedidoService.maiorValorPessoaJuridica(Arrays.asList(pedido1,pedido2,pedido3,pedido4,pedido5,pedido6,pedido7,pedido8));
        System.out.println("-----------------------------------------------");
        System.out.println("Maiores pedidos de pessoas juridicas: " + pedidosPessoaJuridica);
        System.out.println("-----------------------------------------------");

        //Liskov Substituion Principle
        Funcionario funcionario1 = new Funcionario(1L,"Ryan","Caixa",1500.00);
        Funcionario funcionario2 = new Funcionario(2L,"Lucas","Almoxarifado",1400.00);
        System.out.println("Meus funcionarios: " + funcionario1 + funcionario2);

    }
}