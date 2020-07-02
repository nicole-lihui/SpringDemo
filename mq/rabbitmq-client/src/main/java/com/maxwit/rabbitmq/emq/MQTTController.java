package com.maxwit.rabbitmq.emq;

import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mqtt")
public class MQTTController {

    @Autowired
    private BasicAuth basicAuth;

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public void getClients() {
        basicAuth.invokeProtectedResource();
    }
}
