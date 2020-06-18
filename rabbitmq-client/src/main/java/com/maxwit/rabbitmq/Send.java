package com.maxwit.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.nio.charset.StandardCharsets;

public class Send {

    private final static String QUEUE_NAME = "hello-d";

    public static void main(String[] argv) throws Exception {
        String host = "192.168.10.182";

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(host);
        try(Connection connection = factory.newConnection(); Channel channel = connection.createChannel();) {
            //            queue not durable
            //            channel.queueDeclare(QUEUE_NAME, false, false, false, null);

            channel.queueDeclare(QUEUE_NAME, true, false, false, null);
            String message = "Hello World DD message!";

//            message not persistent
//            channel.basicPublish("", QUEUE_NAME, null, message.getBytes(StandardCharsets.UTF_8));

            channel.basicPublish("", QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN, message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] Sent '" + message + "'");
        }
    }
}
