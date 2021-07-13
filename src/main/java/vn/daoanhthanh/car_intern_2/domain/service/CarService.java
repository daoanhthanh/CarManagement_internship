package vn.daoanhthanh.car_intern_2.domain.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import vn.daoanhthanh.car_intern_2.domain.model.dto.CreateCarDTO;
import vn.daoanhthanh.car_intern_2.domain.model.dto.UpdateCarDTO;
import vn.daoanhthanh.car_intern_2.domain.model.entity.Car;

public interface CarService {
    Car createCar(CreateCarDTO car);

    List<Car> getAllCars();

    Optional<Car> getCarById(UUID id);

    // List<Car> getCarByNameLike(String name);
    //
    // List<Car> getCarByOwner(UUID ownerId);

    Car updateCar(UpdateCarDTO car);

    void deleteCar(UUID id);
}
