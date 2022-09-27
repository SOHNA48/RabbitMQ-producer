package com.rabbitmq.producer.rabbitmqproducer.service;

import com.rabbitmq.producer.rabbitmqproducer.vo.RabbitMqMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqService {
    @Autowired
    RabbitTemplate rabbitTemplate;

    private String rabbitMqExchange = "test-exchange";

    private String rabbitMqRoutingKey = "test";

    public void addQueue(RabbitMqMessage rabbitMqMessage) {
        rabbitTemplate.convertAndSend(rabbitMqExchange, rabbitMqRoutingKey, rabbitMqMessage );
    }
}
