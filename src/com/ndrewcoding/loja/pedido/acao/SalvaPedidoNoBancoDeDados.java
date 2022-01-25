package com.ndrewcoding.loja.pedido.acao;

import com.ndrewcoding.loja.pedido.Pedido;

public class SalvaPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados...");
    }

}
