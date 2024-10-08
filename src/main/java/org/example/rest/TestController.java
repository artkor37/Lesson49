package org.example.rest;

import org.example.rest.entity.Car;
import org.example.rest.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {
    private final CarService carService;

    public TestController(CarService carService) {
        this.carService = carService;
    }

    //        @GetMapping("/")
//    public Date getDateTime(){
//        return new Date();
//    }
    @GetMapping("/")
    public String startPage(Model model){
        List<Car> cars = carService.getCars();
        model.addAttribute("cars", cars);
       return "main-page";

    }
}
