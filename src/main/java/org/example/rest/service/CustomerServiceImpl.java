package org.example.rest.service;

import lombok.RequiredArgsConstructor;
import org.example.rest.dao.CustomerRepository;
import org.example.rest.entity.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    @Transactional
    public Customer getCustomersById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    @Transactional
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        customerRepository.delete(id);
    }
}
