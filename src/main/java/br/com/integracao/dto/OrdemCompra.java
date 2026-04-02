package br.com.integracao.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrdemCompra {

    private List<Requisicao> lstPProcessoOrdemCompraRequisicao;

    private String sCdComprador;
    private String sCdGestao;
    private String sCdOrdemCompraEmpresa;
    private String sDsOrdemCompra;
    private String tDtEmissao;
}