package com.nicole.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSercurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
        .withUser("nicole").password("{noop}maxwit").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity https) throws Exception {
        https.authorizeRequests()
        .antMatchers("/profile/**").hasRole("USER")
        .and()
        .formLogin()
        .loginProcessingUrl("/login")
        .permitAll()
        .and()
        .csrf()
        .disable();
    }
}
