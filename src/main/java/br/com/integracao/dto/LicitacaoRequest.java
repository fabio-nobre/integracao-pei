package br.com.integracao.dto;

import lombok.Data;
import java.util.List;

@Data
public class LicitacaoRequest {

    private String bFlProcessoGeraARP;
    private String dQtFornecedoresConvidados;
    private String dQtFornecedoresHabilitados;
    private String dQtFornecedoresParticipantes;

    private List<OrdemCompra> lstPPProcessoOrdemCompra;
    private List<Object> lstPProcessoAnexo;
    private List<ItemProcesso> lstPProcessoItem;
    private List<Object> lstPProcessoLote;

    private String nCdModalidade;
    private String nCdModulo;
    private String nIdTipoApuracao;

    private String sCdComprador;
    private String sDsObjeto;
    private String sDsObservacao;

    private String sNrEdital;
    private String sNrProcessoDisplay;

    private String tDtAgendamento;
    private String tDtFinalDisputa;
    private String tDtFinalProposta;
    private String tDtInicialDisputa;
    private String tDtInicialProposta;
    private String tDtPublicacao;
}
