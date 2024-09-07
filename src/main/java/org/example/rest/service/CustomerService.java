package org.example.rest.service;

import org.example.rest.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();

    Customer getCustomersById(Integer id);

    Customer save(Customer customer);

    void delete(Integer id);
}
