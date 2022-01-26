package com.ndrewcoding.loja.imposto;

import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
