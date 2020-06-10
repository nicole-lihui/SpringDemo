package com.nicole.controller;

import com.nicole.dao.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestBody String username, @RequestBody String password) {

        return "login";
    }

    @RequestMapping("/aa")
    public String success(@RequestBody User user) {

        return "Login Successful ！";
    }

}
