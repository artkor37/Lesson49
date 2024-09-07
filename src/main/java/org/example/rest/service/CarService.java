package org.example.rest.service;

import org.example.rest.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();

    Car getCarById(Integer id);

    Car save(Car car);

    void delete(Integer id);
}
