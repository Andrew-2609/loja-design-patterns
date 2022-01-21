package com.ndrewcoding.loja;

import com.ndrewcoding.loja.desconto.CalculadoraDeDescontos;
import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(orcamento));

    }
}
