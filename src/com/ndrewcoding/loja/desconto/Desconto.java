package com.ndrewcoding.loja.desconto;

import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximoDesconto;

    public Desconto(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);

    public abstract boolean deveAplicar(Orcamento orcamento);

}
