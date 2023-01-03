package com.digipay.service;

import com.digipay.model.entity.Invoice;
import com.digipay.repository.InvoiceRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class InvoiceService {
    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    private InvoiceRepository invoiceRepository;

    public void create(String inputMessage) throws JsonProcessingException {
        Invoice invoice = new Invoice();
        invoice.setInvoiceInformation(inputMessage);
        mongoTemplate.save(invoice);
    }
}
