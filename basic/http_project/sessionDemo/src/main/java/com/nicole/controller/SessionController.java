package com.nicole.controller;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SessionController {

    @RequestMapping("/profile/httpsession")
    public Map getProfileOfHttp(HttpSession httpSession) {
        Map<String, String> m = new HashMap<>();
        SecurityContextImpl attri = (SecurityContextImpl) httpSession.getAttribute("SPRING_SECURITY_CONTEXT");
        m.put("username", attri.getAuthentication().getName());
        m.put("age", "18");
        return m;
    }

    @RequestMapping("/profile/auth")
    public Map getProfileOfAuth(Authentication auth) {
        Map<String, String> m = new HashMap<>(); 
        m.put("username", auth.getName());
        m.put("age", "18");
        return m;
    }
}
