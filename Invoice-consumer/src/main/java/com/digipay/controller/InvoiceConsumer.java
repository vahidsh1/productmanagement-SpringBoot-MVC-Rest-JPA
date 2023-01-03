package com.digipay.controller;

import com.digipay.service.InvoiceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceConsumer {

    @Autowired
    private InvoiceService invoiceService;

    @RabbitListener(queues = "digipay.queue")
    public void listen(String inputMessage) throws JsonProcessingException {
        invoiceService.create(inputMessage);
        System.out.println(" ******"+ inputMessage);

    }
}



