package com.ndrewcoding.loja.pedido;

import com.ndrewcoding.loja.orcamento.Orcamento;
import com.ndrewcoding.loja.pedido.acao.EnviaEmail;
import com.ndrewcoding.loja.pedido.acao.SalvaPedidoNoBancoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void executar(GeraPedido dadosPedido) {
        Orcamento orcamento = new Orcamento(dadosPedido.getValorOrcamento(), dadosPedido.getQuantidade());
        Pedido pedido = new Pedido(dadosPedido.getCliente(), LocalDateTime.now(), orcamento);

        SalvaPedidoNoBancoDeDados salvaPedido = new SalvaPedidoNoBancoDeDados();
        EnviaEmail email = new EnviaEmail();

        salvaPedido.executar(pedido);
        email.executar(pedido);
    }

}
