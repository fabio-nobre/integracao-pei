package br.com.integracao.dto;

import lombok.Data;

@Data
public class Requisicao {

    private String dQtItem;
    private String dVlReferencia;

    private String sCdItemRequisicaoEmpresa;
    private String sCdProduto;
    private String sCdRequisicaoEmpresa;
    private String sCdUnidadeMedida;

    // usado dentro do Item também
    private String sCdComprador;
}