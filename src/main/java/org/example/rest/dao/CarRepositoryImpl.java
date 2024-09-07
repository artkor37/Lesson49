package org.example.rest.dao;

import lombok.RequiredArgsConstructor;
import org.example.rest.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;
@RequiredArgsConstructor
@Repository
public class CarRepositoryImpl implements CarRepository {
    private final SessionFactory sessionFactory;

    @Override
    public List<Car> findAll() {
        Session session = sessionFactory.getCurrentSession();
           List<Car> cars = session.createQuery("from Car", Car.class)
                   .getResultList();
           return cars;
    }
    @Override
    public Car findById(int id){
        Session session = sessionFactory.getCurrentSession();
        Car car = session.get(Car.class, id);
        return car;
    }

    @Override
    public Car save(Car car) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(car);
        return car;
    }

    @Override
    public void delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
//        Query query = session.createQuery("delete from Car c where c.id = :carId");
//        query.setParameter("carId", id);
//        query.executeUpdate();
        Car car = session.get(Car.class, id);
        session.delete(car);
    }
}
