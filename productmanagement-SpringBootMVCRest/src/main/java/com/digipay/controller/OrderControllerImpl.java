package com.digipay.controller;

import com.digipay.model.entity.Customer;
import com.digipay.model.entity.Order;
//import com.digipay.repository.OrderRepository;
import com.digipay.service.CustomerService;
import com.digipay.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderControllerImpl implements OrderController {

    @Autowired
    HttpServletRequest httpServletRequest;
    @Autowired
    private OrderService orderService;
    @Autowired
    private CustomerService customerService;

//    @Autowired
//    private OrderRepository orderRepository;
    String categoryType;
    String customerID;
    String orderStatus;

    //id= Product ID
    @PostMapping("/{id}")
    @Override
    public String registerOrder(@PathVariable Integer id, @RequestHeader HttpHeaders headers) {
        Order order=new Order();
        Customer customer;

        categoryType = httpServletRequest.getHeader("categoryType");
        customerID = httpServletRequest.getHeader("customerID");

        order.setOrderProductID(id);
        order.setOrderStatus("Not Confirmed");
        order.setOrderProductCategory(categoryType);
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        order.setOrderRegisterDate(formatter.format(currentDate));
        customer = customerService.listByID(Integer.valueOf(customerID));
        order.setCustomer(customer);
        orderService.create(order);
        return "Order registered!";
    }
    //id=Customer ID
    @GetMapping("/{id}")
    @Override
    public List<Order> listOrder(@PathVariable Integer id) {
        return orderService.listOrdersByCID(id);
    }

    //id = Order ID
    @PostMapping("/return/{id}")
    @Override
    public String returnOrder(@PathVariable Integer id) throws JsonProcessingException {
        Order orderFetched = orderService.listByID(id);
        orderService.returnOrder(orderFetched);
        return "Order status updated to returned!";
    }
    //id = Order ID
    @PostMapping("/finalize/{id}")
    @Override
    public String finalizeOrder(@PathVariable Integer id, @RequestHeader HttpHeaders headers){
        orderStatus = httpServletRequest.getHeader("orderStatus");

        Order orderFetched = orderService.listByID(id);
        orderFetched.setOrderStatus(orderStatus);
        orderService.finalizeOrder(orderFetched);
        return "Order status finalized to "+orderStatus+"!";
    }

}
