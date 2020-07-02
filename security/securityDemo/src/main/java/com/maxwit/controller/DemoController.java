package com.maxwit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String index(String username) {
        return "Hello , " + username;
    }

    @RequestMapping("/login")
    public String login() {

        return "success";
    }

}
