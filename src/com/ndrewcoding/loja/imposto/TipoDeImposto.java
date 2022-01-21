package com.ndrewcoding.loja.imposto;

import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoDeImposto {

    BigDecimal calcular(Orcamento orcamento);

}
