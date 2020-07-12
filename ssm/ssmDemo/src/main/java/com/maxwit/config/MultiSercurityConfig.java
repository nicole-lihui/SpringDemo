//package com.maxwit.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class MultiSercurityConfig {
//
//    @Bean
//    public PasswordEncoder createDelegatingPasswordEncoder() {
//       return new BCryptPasswordEncoder(10);
//    }
//
//    @Autowired
//    protected static void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin1").password("{noop}maxwit").roles("ADMIN", "USER")
//                .and()
//                .withUser("tom1").password("{noop}maxwit").roles("USER");
//    }
//
//    @Configuration
//    @Order(1)
//    public static class AdminSecurityConfig extends WebSecurityConfigurerAdapter {
//        @Override
//        protected void configure(HttpSecurity https) throws Exception {
//            https.antMatcher("/admin/**")
//                    .authorizeRequests()
//                    .anyRequest()
//                    .hasRole("ADMIN");
//        }
//    }
//
//    @Configuration
//    public static class OtherSecurityConfig extends WebSecurityConfigurerAdapter {
//        @Override
//        protected void configure(HttpSecurity https) throws Exception {
//            https.authorizeRequests()
//                    .anyRequest().authenticated()
//                    .and()
//                    .formLogin()
//                    .loginProcessingUrl("/login")
//                    .permitAll();
//        }
//    }
//}
