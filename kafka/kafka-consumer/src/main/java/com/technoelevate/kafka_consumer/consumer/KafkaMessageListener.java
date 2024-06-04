package com.technoelevate.kafka_consumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "topic-1", groupId = "topic-group")
    public void consumer1(String message) {
        log.info("consumer-1 consume the message {}", message);
    }

    @KafkaListener(topics = "topic-1", groupId = "topic-group")
    public void consumer2(String message) {
        log.info("consumer-2 consume the message {}", message);
    }

    @KafkaListener(topics = "topic-1", groupId = "topic-group")
    public void consumer3(String message) {
        log.info("consumer-2 consume the message {}", message);
    }
}
