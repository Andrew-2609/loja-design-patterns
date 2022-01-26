package com.ndrewcoding.loja.pedido.acao;

import com.ndrewcoding.loja.pedido.Pedido;

public class GeraLog implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido processado: " + pedido);
    }

}
