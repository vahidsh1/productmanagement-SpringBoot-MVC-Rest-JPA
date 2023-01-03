package com.example.invoiceconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class InvoiceConsumer {
    @RabbitListener(queues = "digipay.queue")
    public void listen(String in){
        System.out.println(" ******"+ in);
    }
}
