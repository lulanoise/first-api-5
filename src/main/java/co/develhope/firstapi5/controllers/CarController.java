package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarDTO carDTO;

    @GetMapping
    public String getCar(){
        return carDTO.toString();
    }

    @PostMapping
    public String postCar(@RequestBody @Valid CarDTO car){
        String creation = "Creating a new car";
        return creation + car.toString();
    }
}