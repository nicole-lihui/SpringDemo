package com.nicole.auth.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CustomAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        Map<String, String> authenticationBean = new HashMap<>();
        authenticationBean.put("username", "");
        authenticationBean.put("password", "maxwit");
        System.out.println(request.toString());

        Optional.ofNullable(request.getParameter("code")).ifPresent(loginTmpCode -> {
            System.out.println(loginTmpCode);
            authenticationBean.put("username", loginTmpCode);
        });

        if (! "".equals(authenticationBean.get("username"))) {
            ObjectMapper mapper = new ObjectMapper();
            UsernamePasswordAuthenticationToken authRequest = null;
            try (InputStream is = request.getInputStream()) {
                String username = authenticationBean.get("username");
                String password = authenticationBean.get("password");
                authRequest = new UsernamePasswordAuthenticationToken(
                        username, password);
            } catch (IOException e) {
                e.printStackTrace();
                authRequest = new UsernamePasswordAuthenticationToken(
                        "", "");
            }
            setDetails(request, authRequest);
            return this.getAuthenticationManager().authenticate(authRequest);
        } else {
            // 保留原来的方法
            return super.attemptAuthentication(request, response);
        }
    }
}
