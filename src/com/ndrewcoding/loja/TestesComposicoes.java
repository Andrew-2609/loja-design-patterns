package com.ndrewcoding.loja;

import com.ndrewcoding.loja.orcamento.ItemOrcamento;
import com.ndrewcoding.loja.orcamento.Orcamento;
import com.ndrewcoding.loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TestesComposicoes {
    public static void main(String[] args) {

        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("900")));
        orcamentoNovo.adicionarItem(orcamentoAntigo);

        OrcamentoProxy proxy = new OrcamentoProxy(orcamentoNovo);

        System.out.println("Orçamentos combinados: " + proxy.getValor());
        System.out.println("Orçamentos combinados: " + proxy.getValor());
        System.out.println("Orçamentos combinados: " + proxy.getValor());
        System.out.println("Orçamentos combinados: " + proxy.getValor());

    }
}
