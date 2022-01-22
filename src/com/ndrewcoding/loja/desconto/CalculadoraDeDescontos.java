package com.ndrewcoding.loja.desconto;

import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new
                DescontoParaOrcamentoComMaisDeCincoItens(new
                DescontoParaOrcamentoComValorMaiorQueQuinhentos(new
                SemDesconto())
        );
        return desconto.efetuarCalculo(orcamento);
    }

}
