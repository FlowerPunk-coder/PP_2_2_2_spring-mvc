package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCars(Model model, @RequestParam(required = false, defaultValue = "0") int count) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
