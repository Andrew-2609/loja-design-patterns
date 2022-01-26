package com.ndrewcoding.loja;

import com.ndrewcoding.loja.desconto.CalculadoraDeDescontos;
import com.ndrewcoding.loja.orcamento.ItemOrcamento;
import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {

        Orcamento primeiroOrcamento = new Orcamento();
        Orcamento segundoOrcamento = new Orcamento();

        ItemOrcamento primeiroItem = new ItemOrcamento(new BigDecimal("500"));
        ItemOrcamento segundoItem = new ItemOrcamento(new BigDecimal("550"));

        primeiroOrcamento.adicionarItem(primeiroItem);
        primeiroOrcamento.adicionarItem(segundoItem);

        segundoOrcamento.adicionarItem(segundoItem);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(primeiroOrcamento));
        System.out.println(calculadoraDeDescontos.calcular(segundoOrcamento));

    }
}
