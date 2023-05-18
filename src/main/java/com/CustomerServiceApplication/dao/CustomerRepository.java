package com.CustomerServiceApplication.dao;

import com.CustomerServiceApplication.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
