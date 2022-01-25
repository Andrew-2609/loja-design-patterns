package com.ndrewcoding.loja.pedido;

import com.ndrewcoding.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void executar(GeraPedido dadosPedido) {
        Orcamento orcamento = new Orcamento(dadosPedido.getValorOrcamento(), dadosPedido.getQuantidade());
        Pedido pedido = new Pedido(dadosPedido.getCliente(), LocalDateTime.now(), orcamento);
        System.out.println("Código para salvar pedido no banco de dados...");
        System.out.println("Código para enviar e-mail com dados do novo pedido...");
    }

}
