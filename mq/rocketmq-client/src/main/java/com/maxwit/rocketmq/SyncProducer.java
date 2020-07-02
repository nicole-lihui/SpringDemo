package com.maxwit.rocketmq;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

public class SyncProducer {
    public static void main(String[] args) throws Exception {
        String groupName = "group_demo";
        String namesrvAddr = "192.168.10.182:9876";
        String topicName = "topic-test";

        //Instantiate with a producer group name.
        DefaultMQProducer producer = new DefaultMQProducer(groupName);
        // Specify name server addresses.
        producer.setNamesrvAddr(namesrvAddr);

        //Launch the instance.
        producer.start();
        for (int i = 0; i < 3; i++) {
            //Create a message instance, specifying topic, tag and message body.
            Message msg = new Message( topicName,
                    "TagA" /* Tag */,
                    ("Hello RocketMQ AA" +
                            i).getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
            );
            //Call send message to deliver message to one of brokers.
            SendResult sendResult = producer.send(msg);
            System.out.printf("%s%n", sendResult);
        }
        //Shut down once the producer instance is not longer in use.
        producer.shutdown();
    }
}

