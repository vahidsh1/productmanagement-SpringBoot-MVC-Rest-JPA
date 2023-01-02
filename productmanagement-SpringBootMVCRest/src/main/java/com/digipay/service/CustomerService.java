package com.digipay.service;

import com.digipay.model.entity.Customer;

public interface CustomerService extends BaseService<Customer>{

    public void create(Customer customer);
    public void update(Customer customerNew, Customer customerFetched);
    public void delete(int id);
}
