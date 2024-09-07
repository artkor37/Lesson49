package org.example.rest.service;

import lombok.RequiredArgsConstructor;
import org.example.rest.dao.CarRepository;
import org.example.rest.entity.Car;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Override
    @Transactional
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    @Transactional
    public Car getCarById(Integer id) {
        return carRepository.findById(id);
    }
    @Override
    @Transactional
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        carRepository.delete(id);
    }
}
