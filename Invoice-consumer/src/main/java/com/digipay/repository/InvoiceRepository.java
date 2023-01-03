package com.digipay.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.digipay.model.entity.Invoice;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {

}
