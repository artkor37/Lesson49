package org.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {
        @GetMapping("/")
    public Date getDateTime(){
        return new Date();
    }
}
