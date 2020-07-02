package com.demo.sercurity.controller;

import com.demo.sercurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/hello")
    public String uhello() {
        return "Hello user";
    }

    @RequestMapping("/admin/hello")
    public String acceseTest() {
        return "Hello, " + "admin !";
    }

    @RequestMapping("/root/hello")
    public String rhello() {
        return "Hello root";
    }
}
