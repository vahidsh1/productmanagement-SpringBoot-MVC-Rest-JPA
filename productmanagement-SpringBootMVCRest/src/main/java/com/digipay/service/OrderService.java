package com.digipay.service;

import com.digipay.model.entity.Customer;
import com.digipay.model.entity.Order;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface OrderService extends BaseService<Order>{

    public void create(Order order);
    public void delete(int id);

    public List<Order> listOrdersByCID(int id);
    public void returnOrder(Order order) throws JsonProcessingException;
    public void finalizeOrder(Order order) ;

}
