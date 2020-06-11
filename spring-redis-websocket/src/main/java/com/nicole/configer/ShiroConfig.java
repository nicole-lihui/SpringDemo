//package com.nicole.configer;
//
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.subject.Subject;
//import org.apache.shiro.realm.Realm;
//import org.apache.shiro.realm.text.TextConfigurationRealm;
//import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
//import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.ModelAttribute;
//
//@Configuration
//public class ShiroConfig {
//
//    @Bean
//    public Realm realm() {
//        TextConfigurationRealm realm = new TextConfigurationRealm();
//        realm.setUserDefinitions("joe.coder=password,user\n" +
//                "jill.coder=password,admin");
//        realm.setRoleDefinitions("admin=read,write\n" +
//                "user=read");
//        realm.setCachingEnabled(true);
//
//        return realm;
//    }
//
//    @Bean
//    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
//        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
//        chainDefinition.addPathDefinition("/static/login.html", "authc"); // need to accept POSTs from the login form
//        // logged in users with the 'admin' role
//        chainDefinition.addPathDefinition("/aa", "authc, roles[admin]");
//        chainDefinition.addPathDefinition("/logout", "logout");
//        return chainDefinition;
//    }
//
//    @ModelAttribute(name = "subject")
//    public Subject subject() {
//        return SecurityUtils.getSubject();
//    }
//
//
//
//}
