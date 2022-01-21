package com.ndrewcoding.loja.imposto;

import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoDeImposto tipoDeImposto) {
        return tipoDeImposto.calcular(orcamento);
    }

}
