package com.ndrewcoding.loja.pedido;

import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private final String cliente;
    private final BigDecimal valorOrcamento;
    private final int quantidade;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidade) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidade = quantidade;
    }

    public void executar() {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000.0"), 4);
        Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);
        System.out.println("Código para salvar pedido no banco de dados...");
        System.out.println("Código para enviar e-mail com dados do novo pedido...");
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
