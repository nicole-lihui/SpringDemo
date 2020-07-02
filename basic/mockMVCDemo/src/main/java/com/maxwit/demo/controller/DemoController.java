package com.maxwit.demo.controller;

import com.maxwit.demo.Model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class DemoController {

    @RequestMapping("/user/{name}/access")
    public String getInfo(@PathVariable String name) {
        return name + " : account";
    }

    @GetMapping("/user")
    public String show(String name) {
        return "Hello," + name + " !";
    }

    @PostMapping("/user")
    public String show(@RequestBody User user) {
        return user.toString();
    }
}
