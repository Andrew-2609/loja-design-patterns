package com.ndrewcoding.loja;

import com.ndrewcoding.loja.orcamento.Orcamento;
import com.ndrewcoding.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Andrew Monteiro";
        LocalDateTime data = LocalDateTime.now();
        Orcamento orcamento = new Orcamento(new BigDecimal("1000.0"), 4);

        Pedido pedido = new Pedido(cliente, data, orcamento);
    }

}
