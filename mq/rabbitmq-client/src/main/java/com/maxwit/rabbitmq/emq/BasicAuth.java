package com.maxwit.rabbitmq.emq;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Component
public class BasicAuth {
    private final RestTemplate restTemplate;

    public BasicAuth(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder
                .basicAuthentication("admin", "public")
                .build();
    }

    public void invokeProtectedResource() {

        final ResponseEntity<MQClients> responseEntity = restTemplate.getForEntity("http://router.winger.run:8081/api/v4/clients/", MQClients.class);
        final MQClients body = responseEntity.getBody();
        System.out.println("body = " + body);

        if (!body.getData().isEmpty()) {
            List<Map<String, String>> data = body.getData();
            data.forEach(client -> System.out.println(client.get("clientid")));
        }
    }
}
