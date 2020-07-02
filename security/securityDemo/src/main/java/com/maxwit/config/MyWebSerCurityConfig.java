package com.maxwit.config;

import com.maxwit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class MyWebSerCurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserService userService;

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }

    @Override
    protected void configure(HttpSecurity https) throws Exception {
        https.authorizeRequests()
                .antMatchers("/").hasRole("user")
                .anyRequest().authenticated()
                .and()
                .formLogin()
//                .loginPage("/login_page.html")
                .loginProcessingUrl("/login")
//                .usernameParameter("username")
//                .passwordParameter("passwd")
                .permitAll()
                .and()
                .csrf()
                .disable();
    }
}
