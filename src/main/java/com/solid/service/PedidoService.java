package com.solid.service;

import com.solid.domain.Pedido;
import com.solid.domain.TipoPessoa;
import com.solid.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    public List<Pedido> maiorValor(List<Pedido> pedidos){
        List<Pedido> pedidosMaiores = new ArrayList<>();
        for (Pedido pedido : pedidos){
            if (pedidosMaiores.isEmpty()){
                pedidosMaiores.add(pedido);
            } else if (pedidosMaiores.get(0).getValorTotal().equals(pedido.getValorTotal())) {
                pedidosMaiores.add(pedido);
            } else if (pedidosMaiores.get(0).getValorTotal() < pedido.getValorTotal()) {
                pedidosMaiores.clear();
                pedidosMaiores.add(pedido);
            }
        }
        return pedidosMaiores;
    }

    public List<Pedido> maiorValorPessoaFisica(List<Pedido> pedidos){
        List<Pedido> pedidosPessoaFisica = new ArrayList<>();
        pedidos.forEach(pedido -> {
            if(pedido.getUsuario().getTipoPessoa() == TipoPessoa.PESSOA_FISICA){
                pedidosPessoaFisica.add(pedido);
            }
        });
        return maiorValor(pedidosPessoaFisica);
    }

    public List<Pedido> maiorValorPessoaJuridica(List<Pedido> pedidos){
        List<Pedido> pedidosPessoaJuridica = new ArrayList<>();
        pedidos.forEach(pedido -> {
            if(pedido.getUsuario().getTipoPessoa() == TipoPessoa.PESSOA_JURIDICA){
                pedidosPessoaJuridica.add(pedido);
            }
        });
        return maiorValor(pedidosPessoaJuridica);
    }


}
