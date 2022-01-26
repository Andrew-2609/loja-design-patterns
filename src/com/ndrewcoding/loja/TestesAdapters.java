package com.ndrewcoding.loja;

import com.ndrewcoding.loja.http.JavaHttpClient;
import com.ndrewcoding.loja.orcamento.Orcamento;
import com.ndrewcoding.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapters {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);

    }
}
