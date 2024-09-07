package org.example.rest;

import org.example.rest.entity.Customer;
import org.example.rest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //получение
    @GetMapping("/api/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    // получение по id
    @GetMapping("/api/customers/{id}")
    public Customer getCustomer(@PathVariable Integer id) {
        return customerService.getCustomersById(id);
    }

    //сохранение
    @PostMapping("/api/customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
//обновление
    @PutMapping("/api/customers")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
    //удаление
    @DeleteMapping("/api/customers/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerService.delete(id);
    }
}
