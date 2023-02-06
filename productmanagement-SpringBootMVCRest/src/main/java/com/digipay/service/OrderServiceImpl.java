package com.digipay.service;

import com.digipay.model.entity.Customer;
import com.digipay.model.entity.Order;
import com.digipay.repository.CustomerRepository;
import com.digipay.repository.OrderRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {
    //    @Autowired
    private final WarehouseService warehouseService;
    //    @Autowired
    private final InvoiceService invoiceService;
    //    @Autowired
    private final OrderRepository orderRepository;
//        @Autowired
    private final CustomerRepository customerRepository;
//    public OrderServiceImpl(OrderRepository orderRepository) {
//
//    }


    public OrderServiceImpl(WarehouseService warehouseService, InvoiceService invoiceService, OrderRepository orderRepository, CustomerRepository customerRepository) {
        this.warehouseService = warehouseService;
        this.invoiceService = invoiceService;
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void create(Order order) {
        orderRepository.save(order);
        warehouseService.decreaseStockWareHouse();
    }

    public void delete(int id) {
        orderRepository.deleteById(id);
        warehouseService.increaseStockWareHouse();
    }

    public List<Order> listOrdersByCID(int id) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        List<Order> orderList = orderRepository.findByCustomer(customer);
        return orderList;
    }

    public void returnOrder(Order orderFetched) throws JsonProcessingException {
        orderFetched.setOrderStatus("Returned");
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        orderFetched.setOrderReturnDate(formatter.format(currentDate));
        orderRepository.save(orderFetched);
        warehouseService.increaseStockWareHouse();
        invoiceService.sendOrderToRabbitMQ(orderFetched);

    }

    public void finalizeOrder(Order orderFetched) {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        orderFetched.setOrderFinalizeDate(formatter.format(currentDate));
        orderRepository.save(orderFetched);
    }
}
