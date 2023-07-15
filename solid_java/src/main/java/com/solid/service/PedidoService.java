package com.solid.service;

import com.solid.domain.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    public List<Pedido> maiorValor(List<Pedido> pedidos){
        List<Pedido> pedidosMaiores = new ArrayList<>();
        for (Pedido pedido : pedidos){
            if (pedidosMaiores.isEmpty()){
                pedidosMaiores.add(pedido);
            } else if (pedidosMaiores.get(0).getValorTotal() == pedido.getValorTotal()) {
                pedidosMaiores.add(pedido);
            } else if (pedidosMaiores.get(0).getValorTotal() < pedido.getValorTotal()) {
                pedidosMaiores.clear();
                pedidosMaiores.add(pedido);
            }
        }
        return pedidosMaiores;
    }
}
