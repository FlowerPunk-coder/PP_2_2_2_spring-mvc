package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.impl.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    private final CarService car = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCars(Model model, @RequestParam(required = false, defaultValue = "0") int count) {
        List<Car> carList;
        if (count > 0 && count < 5) {
            carList = car.getAllCars().stream().limit(count).toList();
        } else {
            carList = car.getAllCars();
        }
        model.addAttribute("cars", carList);
        return "cars";
    }
}
