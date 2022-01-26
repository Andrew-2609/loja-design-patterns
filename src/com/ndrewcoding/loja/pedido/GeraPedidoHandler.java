package com.ndrewcoding.loja.pedido;

import com.ndrewcoding.loja.orcamento.ItemOrcamento;
import com.ndrewcoding.loja.orcamento.Orcamento;
import com.ndrewcoding.loja.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private final List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executar(GeraPedido dadosPedido) {
        Orcamento orcamento = new Orcamento();

        ItemOrcamento item = new ItemOrcamento(dadosPedido.getValorOrcamento());

        orcamento.adicionarItem(item);

        Pedido pedido = new Pedido(dadosPedido.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executarAcao(pedido));
    }

}
