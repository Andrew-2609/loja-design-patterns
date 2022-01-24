package com.ndrewcoding.loja.orcamento.situacao;

import com.ndrewcoding.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Finalizado());
    }

}
