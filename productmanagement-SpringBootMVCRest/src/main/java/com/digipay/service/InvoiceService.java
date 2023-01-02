package com.digipay.service;

import com.digipay.model.entity.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.amqp.core.AmqpTemplate;


@Service
public class InvoiceService {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    @Value("rabbitmq.exchange")
    String exchange;
    @Value("rabbitmq.routingKey")
    private String routingKey;

    public void sendOrderToRabbitMQ(Order order) throws JsonProcessingException {

        ObjectMapper objectMapper=new ObjectMapper();
        String s= objectMapper.writeValueAsString(order);
        rabbitTemplate.convertAndSend(exchange,routingKey,s);
    }


}
