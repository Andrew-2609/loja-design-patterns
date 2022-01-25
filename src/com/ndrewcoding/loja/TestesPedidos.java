package com.ndrewcoding.loja;

import com.ndrewcoding.loja.pedido.GeraPedido;
import com.ndrewcoding.loja.pedido.GeraPedidoHandler;
import com.ndrewcoding.loja.pedido.acao.EnviaEmail;
import com.ndrewcoding.loja.pedido.acao.SalvaPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Andrew Monteiro";
        BigDecimal valorOrcamento = new BigDecimal("2000.0");
        int quantidadeItens = 4;

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(
                Arrays.asList(
                        new EnviaEmail(),
                        new SalvaPedidoNoBancoDeDados()
                )
        );
        geraPedidoHandler.executar(geraPedido);
    }

}
