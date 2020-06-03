package com.maxwit.controller;

import com.maxwit.dao.model.UserDO;
import com.maxwit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/{id}")
    public UserDO showByid(@PathVariable int id) {
        return userService.showByid(id);
    }

    @RequestMapping("/admin/test")
    public String acceseTest() {
        return "Hello, " + "admin !";
    }
}
