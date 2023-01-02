package com.digipay.service;

import com.digipay.model.entity.Customer;
import com.digipay.model.entity.Order;
import com.digipay.repository.CustomerRepository;
import com.digipay.repository.OrderRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService  {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    private WarehouseService warehouseService;

    public OrderServiceImpl(OrderRepository orderRepository) {

        this.orderRepository = orderRepository;
    }

    public OrderServiceImpl() {
    }
    @Override
    public void create(Order order) {
        orderRepository.save(order);
        warehouseService.decreaseStockWareHouse();
    }

    public void delete (int id) {
        orderRepository.deleteById(id);
        warehouseService.increaseStockWareHouse();
    }

    public List<Order> listOrdersByCID(int id){
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        List<Order> orderList = orderRepository.findByCustomer(customer);
        return orderList;
    }

    public void returnOrder(Order orderFetched) {
        orderFetched.setOrderStatus("Returned");
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        orderFetched.setOrderReturnDate(formatter.format(currentDate));
        orderRepository.save(orderFetched);
        warehouseService.increaseStockWareHouse();
    }

    public void finalizeOrder(Order orderFetched) {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        orderFetched.setOrderFinalizeDate(formatter.format(currentDate));
        orderRepository.save(orderFetched);
    }
}
