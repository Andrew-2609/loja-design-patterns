package com.ndrewcoding.loja;

import com.ndrewcoding.loja.orcamento.ItemOrcamento;
import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesComposicoes {
    public static void main(String[] args) {

        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("900")));
        orcamentoNovo.adicionarItem(orcamentoAntigo);

        System.out.println("Orçamentos combinados: " + orcamentoNovo.getValor());

    }
}
