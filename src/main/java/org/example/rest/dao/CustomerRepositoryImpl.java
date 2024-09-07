package org.example.rest.dao;

import lombok.RequiredArgsConstructor;
import org.example.rest.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private final SessionFactory sessionFactory;
    @Override
            public List<Customer> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Customer> customers = session.createQuery("FROM Customer", Customer.class)
                .getResultList();
        return customers;
    }

    @Override
    public Customer findById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class, id);
        return customer;
    }

    @Override
    public Customer save(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
        return customer;
    }

    @Override
    public void delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Customer c where c.id = :customerId");
        query.setParameter("customerId", id);
        query.executeUpdate();
    }
}
