package com.ndrewcoding.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

    private final String cliente;
    private final BigDecimal valorOrcamento;
    private final int quantidade;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidade) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidade = quantidade;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
