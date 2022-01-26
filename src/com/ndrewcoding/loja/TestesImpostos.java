package com.ndrewcoding.loja;

import com.ndrewcoding.loja.imposto.CalculadoraDeImpostos;
import com.ndrewcoding.loja.imposto.ICMS;
import com.ndrewcoding.loja.imposto.ISS;
import com.ndrewcoding.loja.orcamento.ItemOrcamento;
import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento();

        ItemOrcamento itemOrcamento = new ItemOrcamento(new BigDecimal("100"));

        orcamento.adicionarItem(itemOrcamento);

        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS(null)));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS(new ICMS(null))));

    }
}
