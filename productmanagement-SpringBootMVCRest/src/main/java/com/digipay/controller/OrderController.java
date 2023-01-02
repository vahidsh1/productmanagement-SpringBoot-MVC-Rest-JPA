package com.digipay.controller;

import com.digipay.model.entity.Order;
import org.springframework.http.HttpHeaders;

import java.util.List;

public interface OrderController {

    String registerOrder(Integer id, HttpHeaders headers);
    List<Order> listOrder(Integer id);
    String returnOrder(Integer id);
    String finalizeOrder(Integer id, HttpHeaders headers);

}
