package web.config.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(List<Car> carList, int count) {
        if (count > 0 && count < 5) {
            return carList.subList(0, count);   //Нужно сделать здесь коллекцию машин cars
        } else {
            return carList;
        }
    }
}
