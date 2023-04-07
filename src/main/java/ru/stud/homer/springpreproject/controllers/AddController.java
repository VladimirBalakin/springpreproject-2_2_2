package ru.stud.homer.springpreproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.stud.homer.springpreproject.models.Car;
import ru.stud.homer.springpreproject.repositories.CarRepository;

@Controller
public class AddController {
    @Autowired
    private CarRepository carRepository;

    @PostMapping("/add")
    public String add(@RequestParam(value = "brand", required = true) String brand,
                      @RequestParam(value = "owner", required = true) String owner,
                      Model model) {
        Car car = new Car(brand, owner);
        carRepository.save(car);
        return "add";
    }

    @GetMapping("/add")
    public String add() {
        return "add";
    }
}
