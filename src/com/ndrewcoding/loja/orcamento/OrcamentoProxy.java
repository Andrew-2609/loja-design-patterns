package com.ndrewcoding.loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {

    private BigDecimal valor;
    private final Orcamento orcamento;

    public OrcamentoProxy(BigDecimal valor, Orcamento orcamento) {
        this.valor = valor;
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if (valor == null) {
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }

}
