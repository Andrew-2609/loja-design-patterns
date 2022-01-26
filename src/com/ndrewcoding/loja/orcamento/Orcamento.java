package com.ndrewcoding.loja.orcamento;

import com.ndrewcoding.loja.orcamento.situacao.EmAnalise;
import com.ndrewcoding.loja.orcamento.situacao.Finalizado;
import com.ndrewcoding.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements  Orcavel {

    private BigDecimal valor;
    private SituacaoOrcamento situacaoOrcamento;
    private final List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.situacaoOrcamento = new EmAnalise();
        this.itens = new ArrayList<>();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacaoOrcamento.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.situacaoOrcamento.aprovar(this);
    }

    public void reprovar() {
        this.situacaoOrcamento.reprovar(this);
    }

    public void finalizar() {
        this.situacaoOrcamento.finalizar(this);
    }

    public boolean isFinalizado() {
        return this.situacaoOrcamento instanceof Finalizado;
    }

    public int getQuantidadeDeItens() {
        return itens.size();
    }

    public void adicionarItem(Orcavel itemOrcamento) {
        this.itens.add(itemOrcamento);
        this.valor = this.valor.add(itemOrcamento.getValor());
    }

    public BigDecimal getValor() {
        return valor;
    }

    public SituacaoOrcamento getSituacaoOrcamento() {
        return situacaoOrcamento;
    }

    public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }

}
