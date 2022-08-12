package web.service.impl;

import web.model.Car;
import web.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getAllCars() {
        Car car = new Car();
        return car.getCars();
    }
}
