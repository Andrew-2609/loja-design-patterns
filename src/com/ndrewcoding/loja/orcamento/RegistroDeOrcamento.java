package com.ndrewcoding.loja.orcamento;

import com.ndrewcoding.loja.exception.DomainException;
import com.ndrewcoding.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private final HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento ainda não está finalizado!");
        }

        String url = "https://api.externa.com.br/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );

        httpAdapter.post(url, dados);
    }

}
