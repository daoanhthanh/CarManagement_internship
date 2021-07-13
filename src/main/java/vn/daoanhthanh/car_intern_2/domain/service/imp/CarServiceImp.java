package vn.daoanhthanh.car_intern_2.domain.service.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.daoanhthanh.car_intern_2.base.CarMapper;
import vn.daoanhthanh.car_intern_2.domain.model.entity.Car;
import vn.daoanhthanh.car_intern_2.domain.model.request.CreateCarRequest;
import vn.daoanhthanh.car_intern_2.domain.model.request.UpdateCarRequest;
import vn.daoanhthanh.car_intern_2.domain.model.response.CarResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.CreateCarResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.UpdateCarResponse;
import vn.daoanhthanh.car_intern_2.domain.repository.CarRepo;
import vn.daoanhthanh.car_intern_2.domain.service.CarService;

@Service
@RequiredArgsConstructor
public class CarServiceImp implements CarService {

    private final CarRepo repository;
    private final CarMapper mapper;

    @Override
    public ResponseEntity<CreateCarResponse> createCar(CreateCarRequest createCarRequest) {
        try {
            Car _car = mapper.mapCreateRequestToCar(createCarRequest);
            Car carResponse = repository.save(_car);
            CreateCarResponse response = mapper.mapCarToCreateCarResponse(carResponse);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<CarResponse>> getAllCars() {
        try {
            List<Car> cars = new ArrayList<Car>();
            repository.findAll().forEach(cars::add);
            List<CarResponse> carsResponse = mapper.mapListCarToResponse(cars);
            return new ResponseEntity<>(carsResponse, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<CarResponse> getCarById(UUID id) {
        Optional<Car> carData = repository.findById(id);
        if (carData.isPresent()) {
            CarResponse car = mapper.mapCarToCarResponse(carData.get());
            return new ResponseEntity<>(car, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<UpdateCarResponse> updateCar(UUID id, UpdateCarRequest updateCarRequest) {
        Car carData = repository.findById(id).orElse(null);
        if (carData != null) {
            Car car = repository.save(mapper.mapUpdateRequestToCar(updateCarRequest));
            UpdateCarResponse res = mapper.mapCarToUpdateCarResponse(car);
            return new ResponseEntity<>(res, HttpStatus.OK);

        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<HttpStatus> deleteCar(UUID id) {
        try {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
