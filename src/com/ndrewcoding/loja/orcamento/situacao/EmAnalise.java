package com.ndrewcoding.loja.orcamento.situacao;

import com.ndrewcoding.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Reprovado());
    }

}
