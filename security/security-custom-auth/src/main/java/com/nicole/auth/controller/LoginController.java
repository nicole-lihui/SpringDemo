package com.nicole.auth.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginController {

    @RequestMapping("success")
    public String success() {
        return "Success: Hello";
    }

    @RequestMapping("failure")
    public String failure() {
        return "Fail";
    }
}
