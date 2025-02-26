package org.example.exeption;

import org.example.exeption.exeption.CarNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @GetMapping("{brand}")
    String getCarBrand(@PathVariable String brand) {
        if (!brand.equals("porsche")) {
            throw new CarNotFoundException("Only 'porsche' allowed, car "+brand+" not found");
        }
        return brand;
    }

    @GetMapping
    String getAllCars() {
        throw new CarNotFoundException("No Cars found");
    }
}