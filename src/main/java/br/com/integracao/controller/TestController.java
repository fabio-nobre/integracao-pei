package br.com.integracao.controller;

import br.com.integracao.client.LicitacaoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final LicitacaoClient client;

    @GetMapping("/test")
    public String testar() {
        return client.enviar("{}");
    }
}
