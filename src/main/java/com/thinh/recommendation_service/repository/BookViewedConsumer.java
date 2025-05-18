package com.thinh.recommendation_service.repository;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BookViewedConsumer {

    @KafkaListener(topics = "book_viewed_topic", groupId = "book-group-id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
