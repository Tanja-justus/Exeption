package org.example.exeption;



import org.example.exeption.exeption.AnimalNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @GetMapping("{species}")
    String getAnimalSpecies(@PathVariable String species) {
        if (!species.equals("dog")) {
            throw new AnimalNotFoundException("Only 'dog' is allowed, animal "+ species +" not found");
        }
        return species;
    }

    @GetMapping
    String getAllAnimals() {
        throw new AnimalNotFoundException("No Animals found");
    }
}
