package br.com.integracao.dto;

import lombok.Data;

import java.util.List;

@Data
public class ItemProcesso {

    private String dQtItem;
    private String dQtParticipanteItem;
    private String dVlLance;
    private String dVlReferencia;

    private List<Requisicao> lstPProcessoOrdemCompraRequisicao;

    private String nCdItemSequencial;
    private String nCdLoteSequencial;

    private String nCdMarca;
    private String nStSituacao;

    private String sCdFornecedor;
    private String sDsMarca;

    private String tDtAdjudicado;
    private String tDtEncerramento;
    private String tDtFinalizado;
    private String tDtRevogado;
}