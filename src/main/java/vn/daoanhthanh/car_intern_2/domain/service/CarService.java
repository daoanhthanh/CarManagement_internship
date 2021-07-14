package vn.daoanhthanh.car_intern_2.domain.service;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import vn.daoanhthanh.car_intern_2.domain.model.request.CreateCarRequest;
import vn.daoanhthanh.car_intern_2.domain.model.request.UpdateCarRequest;
import vn.daoanhthanh.car_intern_2.domain.model.response.CarResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.CreateCarResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.UpdateCarResponse;

public interface CarService {
    ResponseEntity<CreateCarResponse> createCar(CreateCarRequest createCarRequest);

    ResponseEntity<List<CarResponse>> getAllCars();

    ResponseEntity<CarResponse> getCarById(UUID id);

    // List<Car> getCarByNameLike(String name);
    //
    // List<Car> getCarByOwner(UUID ownerId);

    ResponseEntity<UpdateCarResponse> updateCar(UUID id, UpdateCarRequest updateCarRequest);

    ResponseEntity<HttpStatus> deleteCar(UUID id);
}
