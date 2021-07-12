package vn.daoanhthanh.car_intern_2.domain.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vn.daoanhthanh.car_intern_2.domain.model.entity.Car;
import vn.daoanhthanh.car_intern_2.domain.service.CarService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    public ResponseEntity<List<Car>> getAllCars(@RequestParam(required = false) String vehicleName) {
        try {
            List<Car> cars = new ArrayList<Car>();

            if (vehicleName == null)
                cars.addAll(carService.getAllCars());
            // else
            // carService.getCarByNameLike(vehicleName).forEach(cars::add);

            if (cars.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(cars, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable("id") UUID carId) {
        Optional<Car> carData = carService.getCarById(carId);

        return carData.map(car -> new ResponseEntity<>(car, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        try {
            Car _car = carService.createCar(new Car(car.getModel(), car.getCarType(), car.getSeat(),
                    car.getRegistrationNumber(), car.getCylinderCapacity(), car.getTransmission(), car.getEngineID(),
                    car.getOwnerID(), LocalDateTime.now(), LocalDateTime.now()));
            return new ResponseEntity<>(_car, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable("id") UUID id, @RequestBody Car car) {
        Optional<Car> carData = carService.getCarById(id);

        if (carData.isPresent()) {
            Car _car = carData.get();
            _car.setModel(car.getModel());
            _car.setSeat(car.getSeat());
            _car.setRegistrationNumber(car.getRegistrationNumber());
            _car.setEngineID(car.getEngineID());
            _car.setOwnerID(car.getOwnerID());
            _car.setCreatedAt(car.getCreatedAt());
            _car.setUpdatedAt(LocalDateTime.now());
            return new ResponseEntity<>(carService.updateCar(_car), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCar(@PathVariable("id") UUID id) {
        try {
            carService.deleteCar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
