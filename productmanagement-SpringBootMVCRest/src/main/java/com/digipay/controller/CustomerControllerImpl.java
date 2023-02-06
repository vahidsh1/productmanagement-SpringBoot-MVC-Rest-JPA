package com.digipay.controller;

import com.digipay.model.entity.Customer;
import com.digipay.service.BaseService;
import com.digipay.service.CustomerServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerControllerImpl implements CustomerController {
    @Autowired
    private BaseService<Customer> baseService;
    @PostMapping("/")
    @Override
    public String RegisterCustomer(@RequestBody Customer customer) {
        baseService.create(customer);
        return "Customer registered!";
    }
    @GetMapping("/{id}")
    @Override
    public Customer listCustomer(@PathVariable Integer id) {
        Customer customer = baseService.listByID(id);
        return customer;
    }
    @PutMapping("/{id}")
    @Override
    public String updateCustomer(@PathVariable Integer id, @RequestBody Customer customerNew) {
        Customer customerFetched = baseService.listByID(id);
        baseService.update(customerNew, customerFetched);
        return "Product updated!";
    }
    @DeleteMapping("/{id}")
    @Override
    public String deleteCustomer(@PathVariable Integer id) {
        baseService.delete(id);
        return "Customer deleted!";
    }
}
