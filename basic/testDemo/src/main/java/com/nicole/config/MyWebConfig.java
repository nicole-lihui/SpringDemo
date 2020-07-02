package com.nicole.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class MyWebConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("nicole").password("{noop}123456").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity https) throws Exception {
        https.authorizeRequests()
//                .antMatchers("/aa").hasRole("USER")
//                .antMatchers("/css/**", "/img/**", "/js/**", "index.html", "favicon.ico").permitAll()
                .antMatchers( "index.html", "/assets/**", "/main.dart.js", "main.dart.js.map", "main.dart.js.deps").permitAll()
//                .anyRequest().authenticated()
                .and()
                .formLogin()
//                .loginPage("/index.html")
                .loginProcessingUrl("/login")
                .permitAll()
                .and()
                .cors()
                .configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues())
                .and()
                .csrf()
                .disable();

    }

//    @Bean
//    CorsConfigurationSource corsConfigurationSource() {
//        CorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        ((UrlBasedCorsConfigurationSource) source).registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
//        return source;
//    }

}