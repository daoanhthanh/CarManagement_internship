package vn.daoanhthanh.car_intern_2.domain.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vn.daoanhthanh.car_intern_2.domain.model.request.CreateCarRequest;
import vn.daoanhthanh.car_intern_2.domain.model.request.UpdateCarRequest;
import vn.daoanhthanh.car_intern_2.domain.model.response.CarResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.CreateCarResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.UpdateCarResponse;
import vn.daoanhthanh.car_intern_2.domain.service.CarService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    @GetMapping("/all")
    public ResponseEntity<List<CarResponse>> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarResponse> getCarById(@PathVariable("id") UUID carId) {
        return carService.getCarById(carId);
    }

    @PostMapping("/car")
    public ResponseEntity<CreateCarResponse> createCar(@RequestBody CreateCarRequest createCarRequest) {
        return carService.createCar(createCarRequest);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UpdateCarResponse> updateCar(@PathVariable("id") UUID id,
            @RequestBody UpdateCarRequest updateCarRequest) {
        return carService.updateCar(id, updateCarRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCar(@PathVariable("id") UUID id) {
        return carService.deleteCar(id);
    }

}
