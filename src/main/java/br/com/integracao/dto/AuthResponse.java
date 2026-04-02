package br.com.integracao.dto;

import lombok.Data;

@Data
public class AuthResponse {
    private boolean sucesso;
    private String mensagem;
    private String token;
    private String tipoToken;
    private String expiracao;
}
