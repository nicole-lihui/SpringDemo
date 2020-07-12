//package com.nicole.websocktdemo;
//
//import com.nicole.websocktdemo.websocket.WebSocketNotificationHandler;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;
//
//@Configuration
//@EnableWebSocket
//public class WebSocketConfig implements WebSocketConfigurer {
//
//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        WebSocketNotificationHandler notificationHandler = new WebSocketNotificationHandler();
//
//        registry.addHandler(notificationHandler, "/ws-notification")
//                .addInterceptors(new HttpSessionHandshakeInterceptor())
//                .withSockJS();
//    }
//}
