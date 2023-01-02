package com.digipay.service;


import com.digipay.model.entity.Customer;
import com.digipay.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer> implements CustomerService  {

    @Autowired
    protected CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerServiceImpl() {

    }
    @Override
    public void create(Customer customer) {
        customerRepository.save(customer);
    }
    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void update(Customer customerNew, Customer customerFetched) {
        customerFetched.setCustomerAddress(customerNew.getCustomerAddress());
        customerFetched.setCustomerContact(customerNew.getCustomerContact());
        customerFetched.setCustomerName(customerNew.getCustomerName());
        customerFetched.setCustomerUserName(customerNew.getCustomerUserName());
        customerRepository.save(customerFetched);
    }
}
