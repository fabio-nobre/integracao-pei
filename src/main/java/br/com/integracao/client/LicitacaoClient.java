package br.com.integracao.client;

import br.com.integracao.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tools.jackson.databind.ObjectMapper;

@Component
@RequiredArgsConstructor
public class LicitacaoClient {

    private final RestTemplate restTemplate;
    private final TokenService tokenService;

    public String enviar(Object request) {


        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(request));

        String url = "http://localhost:8080/api/incluirlicitacaoeletronica";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + tokenService.getToken());
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> entity = new HttpEntity<>(request, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(
                url,
                entity,
                String.class
        );

        return response.getBody();
    }
}