package vn.daoanhthanh.car_intern_2.domain.service.imp;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import vn.daoanhthanh.car_intern_2.domain.model.entity.Car;
import vn.daoanhthanh.car_intern_2.domain.repository.CarRepo;
import vn.daoanhthanh.car_intern_2.domain.service.CarService;

@Service
public class CarServiceImp implements CarService {

    private final CarRepo repository;

    public CarServiceImp(CarRepo repository) {
        this.repository = repository;
    }

    @Override
    public Car createCar(Car car) {
        return repository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return repository.findAll();
    }

    @Override
    public Optional<Car> getCarById(UUID id) {
        return repository.findById(id);
    }

    // @Override
    // public List<Car> getCarByNameLike(String name) {
    // return repository.findCarByName(name);
    // }
    //
    // @Override
    // public List<Car> getCarByOwner(UUID ownerId) {
    // return repository.findCarByOwner(ownerId);
    // }

    @Override
    public Car updateCar(Car car) {
        return repository.save(car);
    }

    @Override
    public void deleteCar(UUID id) {
        repository.deleteById(id);
    }

}
