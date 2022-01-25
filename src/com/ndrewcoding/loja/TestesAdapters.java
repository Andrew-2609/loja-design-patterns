package com.ndrewcoding.loja;

import com.ndrewcoding.loja.http.JavaHttpClient;
import com.ndrewcoding.loja.orcamento.Orcamento;
import com.ndrewcoding.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapters {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);

    }
}
