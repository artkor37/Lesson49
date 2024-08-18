package org.example.rest;

import org.example.rest.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CustomerController {
    @Autowired
    private SessionFactory sessionFactory;

    @GetMapping("/api/customers")
    @Transactional
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        List<Customer> customers = session.createQuery("FROM Customer", Customer.class)
                .getResultList();
        return customers;
//        return customers.stream()
//                .filter(c -> c.getFirstname().contains("a") || c.getFirstname().contains("A"))
//                .collect(Collectors.toList());
    }
}
