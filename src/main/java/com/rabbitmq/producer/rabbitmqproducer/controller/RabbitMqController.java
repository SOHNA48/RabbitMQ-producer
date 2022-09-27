package com.rabbitmq.producer.rabbitmqproducer.controller;

import com.rabbitmq.producer.rabbitmqproducer.service.RabbitMqService;
import com.rabbitmq.producer.rabbitmqproducer.vo.RabbitMqMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {
    @Autowired
    RabbitMqService rabbitMqService;

    @RequestMapping("/messegeSend")
    public RabbitMqMessage send(RabbitMqMessage rabbitMqMessage) {
        rabbitMqService.addQueue(rabbitMqMessage);
        return rabbitMqMessage;
    }

}