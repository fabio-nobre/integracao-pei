package br.com.integracao.controller;

import br.com.integracao.client.LicitacaoClient;
import br.com.integracao.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final LicitacaoClient client;

    @GetMapping("/test")
    public String testar() {

        // 🔹 Requisição
        Requisicao req = new Requisicao();
        req.setDQtItem("100.0000");
        req.setDVlReferencia("0.0082");
        req.setSCdItemRequisicaoEmpresa("1");
        req.setSCdProduto("1002201");
        req.setSCdRequisicaoEmpresa("120101000012026000138");
        req.setSCdUnidadeMedida("1");

        // 🔹 Ordem de compra
        OrdemCompra ordem = new OrdemCompra();
        ordem.setLstPProcessoOrdemCompraRequisicao(List.of(req));
        ordem.setSCdComprador("120101");
        ordem.setSCdGestao("00001");
        ordem.setSCdOrdemCompraEmpresa("120101000012026000138");
        ordem.setSDsOrdemCompra("Teste integração");
        ordem.setTDtEmissao("2026-03-18T10:30:54");

        // 🔹 Item
        ItemProcesso item = new ItemProcesso();
        item.setDQtItem("100.0000");
        item.setDQtParticipanteItem("1");
        item.setDVlLance("10.0000");
        item.setDVlReferencia("0.0082");
        item.setLstPProcessoOrdemCompraRequisicao(List.of(req));
        item.setNCdItemSequencial("1");
        item.setNCdMarca("123");
        item.setNStSituacao("7");
        item.setSCdFornecedor("9999");
        item.setSDsMarca("TESTE");
        item.setTDtFinalizado("2026-03-19T14:40:30");

        // 🔥 Licitação principal
        LicitacaoRequest lic = new LicitacaoRequest();
        lic.setBFlProcessoGeraARP("1");
        lic.setDQtFornecedoresConvidados("10");
        lic.setDQtFornecedoresHabilitados("1");
        lic.setDQtFornecedoresParticipantes("1");

        lic.setLstPPProcessoOrdemCompra(List.of(ordem));
        lic.setLstPProcessoAnexo(List.of());
        lic.setLstPProcessoItem(List.of(item));
        lic.setLstPProcessoLote(List.of());

        lic.setNCdModalidade("57");
        lic.setNCdModulo("18");
        lic.setNIdTipoApuracao("1");

        lic.setSCdComprador("120101");
        lic.setSDsObjeto("Teste integração");
        lic.setSDsObservacao("Observação teste");

        lic.setSNrEdital("001");
        lic.setSNrProcessoDisplay("001");

        lic.setTDtAgendamento("2026-03-19T14:30:30");
        lic.setTDtInicialProposta("2026-03-18T11:00:00");
        lic.setTDtFinalProposta("2026-04-01T12:00:00");
        lic.setTDtPublicacao("2026-03-18T11:00:00");

        // 🚀 envio
        return client.enviar(lic);
    }

    @PostMapping("/licitacao")
    public String enviar(@RequestBody LicitacaoRequest request) {
        return client.enviar(request);
    }

}