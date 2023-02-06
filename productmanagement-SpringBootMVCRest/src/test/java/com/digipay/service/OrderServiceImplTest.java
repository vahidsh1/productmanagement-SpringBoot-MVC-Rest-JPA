//package com.digipay.service;
//
//import com.digipay.model.entity.Customer;
//import com.digipay.model.entity.Order;
//import com.digipay.repository.CustomerRepository;
//import com.digipay.repository.OrderRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//class OrderServiceImplTest {
////    @Autowired
//    OrderServiceImpl orderService;
//    OrderService orderServiceMock;
//    ArrayList<Order> orders;
//
//
//    //    @Test
////    void listOrdersByCID() {
////        int id;
////        List<Order> orders ;
////        Given:
////        id = 1;
////        When:
//////        orderService.listOrdersByCID(id);
////        orders=orderService.listOrdersByCID(id);
////        Then:
////        Assertions.assertFalse(orders.isEmpty());
////        Assertions.assertEquals(6,orders.size());
//    @Autowired
//
//    private InvoiceService invoiceService;
//    //    @Autowired
//
//
//    @Autowired
//    private WarehouseService warehouseService;
//    @Autowired
//
//    private OrderRepository orderRepository;
//    @Autowired
//    //    @Autowired
//    private CustomerRepository customerRepository;
//
//    @BeforeEach
//    void mockMethod() {
//        CustomerRepository mock = Mockito.mock(CustomerRepository.class);
//        orderServiceMock = new OrderServiceImpl(warehouseService,invoiceService
//                ,orderRepository,mock);
//        Customer customer = new Customer();
//        customer.setCustomerID(1);
//        when(mock.findById(any())).thenReturn(Optional.of(customer));
//    }
//    @Test
//    void Given1_whenlistOrdersByCID_thenreturnnull() {
//        int id;
//        List<Order> orders1;
//        Given:
//        id = 2;
//        When:
//        orders1 = orderServiceMock.listOrdersByCID(id);
//        Then:
//        Assertions.assertFalse(orders1.isEmpty());
//    }
//}