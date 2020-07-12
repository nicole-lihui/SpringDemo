package com.nicole.websocktdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MsgSendController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @RequestMapping("send")
    public String send() {
        String destination = "/topic/messages";
        Map<String, String> m = new HashMap<>();
        m.put("name", "nicole");
        m.put("status", "qq");

        User u = new User();
        u.setName("nicole");
        u.setAge("33");
        simpMessagingTemplate.convertAndSend(destination, u);
        return "OK";
    }
}
