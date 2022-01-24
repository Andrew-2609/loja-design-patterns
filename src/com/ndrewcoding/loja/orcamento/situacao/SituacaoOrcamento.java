package com.ndrewcoding.loja.orcamento.situacao;

import com.ndrewcoding.loja.exception.DomainException;
import com.ndrewcoding.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser finalizado!");
    }

}
