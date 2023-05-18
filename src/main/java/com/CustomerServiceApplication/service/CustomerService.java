package com.CustomerServiceApplication.service;

import com.CustomerServiceApplication.dao.CustomerRepository;
import com.CustomerServiceApplication.model.Customer;

import java.util.List;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    public void updateCustomer(Integer id, Customer updatedCustomer) {
        Customer customer = customerRepository.findById(id).orElseGet(Customer::new);
        customer.setName(updatedCustomer.getName());
        customer.setEmail(updatedCustomer.getEmail());
        customer.setAge(updatedCustomer.getAge());
        customerRepository.save(customer);
    }

}
