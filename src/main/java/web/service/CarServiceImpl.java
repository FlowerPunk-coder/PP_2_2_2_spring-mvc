package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final Car car = new Car();

    @Override
    public List<Car> getCars(int count) {
        List<Car> carList;
        if (count > 0 && count < 5) {
            carList = car.getCars().stream().limit(count).toList();
        } else {
            carList = car.getCars();
        }
        return carList;
    }
}
