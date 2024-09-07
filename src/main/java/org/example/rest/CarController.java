package org.example.rest;

import org.example.rest.entity.Car;
import org.example.rest.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

        @GetMapping("")
        public List<Car> getCars () {
            return carService.getCars();
        }

        @GetMapping("/{id}")
        public Car getCarById (@PathVariable Integer id){
            return carService.getCarById(id);
        }

        @PostMapping("")
        public Car createCar (@RequestBody Car car){
            return carService.save(car);
        }

        @PutMapping("")
        public Car updateCar (@RequestBody Car car){
            return carService.save(car);
        }

        @DeleteMapping("/{id}")
        public void deleteCar (@PathVariable Integer id){
            carService.delete(id);
        }
    }
