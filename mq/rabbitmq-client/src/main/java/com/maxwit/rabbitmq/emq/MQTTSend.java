package com.maxwit.rabbitmq.emq;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MQTTSend {

    public static void main(String[] args) throws MqttException {

        String msg = "Router Hello";
        String topic = "hello";
        System.out.println("== START PUBLISHER ==");

        MqttClient client = new MqttClient("tcp://router.winger.run:1883", MqttClient.generateClientId());
        client.connect();
        MqttMessage message = new MqttMessage();
        message.setPayload(msg.getBytes());
        client.publish(topic, message);

        System.out.println("\tMessage '" + msg + "' to '" + topic);

        client.disconnect();

        System.out.println("== END PUBLISHER ==");

    }
}
