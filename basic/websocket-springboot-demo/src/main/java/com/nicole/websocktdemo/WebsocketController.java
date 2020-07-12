package com.nicole.websocktdemo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebsocketController {

    @GetMapping("/stomp-broadcast")
    public String broadcast() {
        return "stomp-broadcast";
    }



    @MessageMapping("/broadcast")
//    @SendTo("/topic/messages")
    public void send() throws Exception {
        System.out.println("Hello");
    }
}
