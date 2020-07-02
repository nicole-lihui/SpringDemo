package com.nicole.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;
import java.util.concurrent.Future;


public class Producer {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "192.168.10.182:9092");
        properties.put("acks", "all");
        properties.put("retries", 0);
        properties.put("batch.size", 16384);
        properties.put("buffer.memory", 33554432);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);
        // Send 10 messages synchronously
        for (int i = 1; i <= 3; i++) {
            kafkaProducer.send(new ProducerRecord<>("java-client-test", "test,test,test " + i));
        }

        try{
            // Synchronously send a message to obtain RecordMetadata. The server has confirmed the metadata of the record
            Future<RecordMetadata> future = kafkaProducer.send(new ProducerRecord<>("java-client-test", "test,test,test"));
            RecordMetadata recordMetadata = future.get();
            System.out.printf("RecordMetadata : topic = %s, partition = %d, offset = %d, toString() = %s\n",
                    recordMetadata.topic(),recordMetadata.partition(),recordMetadata.offset(),recordMetadata.toString());
        } catch(Exception e) {
            // Connection error and No Leader error can be solved by retrying
            // If the message is too large, kafkaProducer will not try again and throw an exception directly
            e.printStackTrace();
        }

        kafkaProducer.close();
    }
}
