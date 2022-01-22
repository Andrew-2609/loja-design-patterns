package com.ndrewcoding.loja;

import com.ndrewcoding.loja.desconto.CalculadoraDeDescontos;
import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {

        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("100"), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(primeiroOrcamento));
        System.out.println(calculadoraDeDescontos.calcular(segundoOrcamento));

    }
}
