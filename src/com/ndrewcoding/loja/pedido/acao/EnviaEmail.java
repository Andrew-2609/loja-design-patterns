package com.ndrewcoding.loja.pedido.acao;

import com.ndrewcoding.loja.pedido.Pedido;

public class EnviaEmail implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando e-mail com dados do pedido...");
    }

}
