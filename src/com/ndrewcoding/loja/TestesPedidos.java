package com.ndrewcoding.loja;

import com.ndrewcoding.loja.pedido.GeraPedido;
import com.ndrewcoding.loja.pedido.GeraPedidoHandler;
import com.ndrewcoding.loja.pedido.acao.EnviaEmail;
import com.ndrewcoding.loja.pedido.acao.SalvaPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

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
