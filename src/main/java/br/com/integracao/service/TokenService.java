package br.com.integracao.service;

import br.com.integracao.dto.AuthRequest;
import br.com.integracao.dto.AuthResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

// - Recebe token
// - Guarda em memória

@Service
@RequiredArgsConstructor
public class TokenService {

    private final RestTemplate restTemplate;
    private String token;

    public String getToken() {
        if (token == null) {
            autenticar();
        }
        return token;
    }

    private void autenticar() {
        String url = "http://localhost:8080/api/autenticacao";

        AuthRequest request = new AuthRequest("integracao_cliente", "123456");

        AuthResponse response = restTemplate.postForObject(
                url,
                request,
                AuthResponse.class
        );

        this.token = response.getToken();
    }
}