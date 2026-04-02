package br.com.integracao.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class MockController {

    @PostMapping("/autenticacao")
    public Map<String, Object> auth() {
        return Map.of(
                "sucesso", true,
                "mensagem", "OK",
                "token", "TOKEN_FAKE_123",
                "tipoToken", "Bearer",
                "expiracao", "2026-12-31T23:59:59"
        );
    }

    @PostMapping("/incluirlicitacaoeletronica")
    public Map<String, Object> licitacao() {
        return Map.of(
                "sucesso", true,
                "idProcesso", 123,
                "numeroProcesso", "TESTE-001"
        );
    }
}