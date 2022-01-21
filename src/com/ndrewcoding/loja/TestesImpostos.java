package com.ndrewcoding.loja;

import com.ndrewcoding.loja.imposto.CalculadoraDeImpostos;
import com.ndrewcoding.loja.imposto.TipoDeImposto;
import com.ndrewcoding.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoDeImposto.ICMS));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoDeImposto.ISS));

    }
}
