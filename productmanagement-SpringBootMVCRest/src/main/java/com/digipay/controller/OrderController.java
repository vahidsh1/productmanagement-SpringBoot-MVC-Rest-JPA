package com.digipay.controller;

import com.digipay.model.entity.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpHeaders;

import java.util.List;

public interface OrderController {

    String registerOrder(Integer id, HttpHeaders headers);
    List<Order> listOrder(Integer id);
    String returnOrder(Integer id) throws JsonProcessingException;
    String finalizeOrder(Integer id, HttpHeaders headers);

}
