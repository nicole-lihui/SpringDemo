package com.nicole.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/fe/websocket")
@Component
public class DeviceWebSocket {

//    concurrent包的线程安全Set，用来存放每个客户端对应的DeviceWebSocket对象。
    private static CopyOnWriteArraySet<DeviceWebSocket> webSocketSet = new CopyOnWriteArraySet<DeviceWebSocket>();
    private Session session;

    @OnOpen
    public void onOpen(Session son) {
        session = son;
        webSocketSet.add(this);
        System.out.println("New Connnect Join...");
    }

    @OnClose
    public void onClose() {
        //delete from Set
        webSocketSet.remove(this);
        System.out.println("Connect Close...");
    }

    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("WebSocket--->--->--Exception");
        error.printStackTrace();
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        System.out.println("From Client Says：" + message);
        sendInfo("Hello,client!");
    }

    public static void sendInfo(String message) throws IOException {
        sendAll(message);
    }

    private static void sendAll(String message) {
        Arrays.asList(webSocketSet.toArray()).forEach(item -> {
            DeviceWebSocket deviceWebSocket = (DeviceWebSocket) item;
            //群发
            try {
                deviceWebSocket.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void sendMessage(String message) throws IOException {
        //获取session远程基本连接发送文本消息
        this.session.getBasicRemote().sendText(message);
    }


}
