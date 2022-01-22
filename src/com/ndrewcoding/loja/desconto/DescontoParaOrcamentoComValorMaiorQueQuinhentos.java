package com.ndrewcoding.loja.desconto;

import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return proximoDesconto.calcular(orcamento);
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

}
