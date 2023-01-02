package com.digipay.controller;
import com.digipay.model.entity.Customer;

public interface CustomerController {

    String RegisterCustomer(Customer customer);
    Customer listCustomer(Integer id);
    String updateCustomer(Integer id,  Customer customer);
    String deleteCustomer(Integer id);

}
