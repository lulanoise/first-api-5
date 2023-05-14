package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    CarDTO carDTO = new CarDTO();

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