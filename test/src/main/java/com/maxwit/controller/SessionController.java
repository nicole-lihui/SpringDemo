package com.maxwit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SessionController {

    @RequestMapping("/set")
    public String set(Integer x, HttpSession session) {
        System.out.println("set(): " + session.getId());
        session.setAttribute("xx", x);
        return "OK";
    }

    @RequestMapping("/get")
    public Integer get(HttpSession session) {
        System.out.println("get(): " + session.getId());
        return (Integer) session.getAttribute("xx");
    }
}
