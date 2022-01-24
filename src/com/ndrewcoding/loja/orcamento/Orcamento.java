package com.ndrewcoding.loja.orcamento;

import com.ndrewcoding.loja.orcamento.situacao.EmAnalise;
import com.ndrewcoding.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private final int quantidadeItens;
    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacaoOrcamento = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacaoOrcamento.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public SituacaoOrcamento getSituacaoOrcamento() {
        return situacaoOrcamento;
    }

    public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }

}
