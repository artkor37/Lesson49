package org.example.rest;

import org.example.rest.entity.Car;
import org.example.rest.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarControllerJsp {
    private final CarService carService;

    public CarControllerJsp(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/api/cars/table")
    public String startPage(Model model) {
        List<Car> cars = carService.getCars();
        model.addAttribute("cars", cars);
        return "table-cars";
    }
}
