package com.ndrewcoding.loja.imposto;

import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS {

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
