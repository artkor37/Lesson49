package org.example.rest.dao;

import org.example.rest.entity.Car;

import java.util.List;

public interface CarRepository {
    List<Car> findAll();
    Car findById(int id);
    Car save(Car car);
    void delete(Integer id);
}
