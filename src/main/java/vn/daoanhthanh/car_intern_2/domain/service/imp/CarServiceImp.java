package vn.daoanhthanh.car_intern_2.domain.service.imp;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import vn.daoanhthanh.car_intern_2.base.CarMapper;
import vn.daoanhthanh.car_intern_2.domain.model.entity.Car;
import vn.daoanhthanh.car_intern_2.domain.model.request.CreateCarRequest;
import vn.daoanhthanh.car_intern_2.domain.model.request.UpdateCarRequest;
import vn.daoanhthanh.car_intern_2.domain.model.response.CarResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.CreateCarResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.UpdateCarResponse;
import vn.daoanhthanh.car_intern_2.domain.repository.CarRepository;
import vn.daoanhthanh.car_intern_2.domain.service.CarService;

@Service
@RequiredArgsConstructor
public class CarServiceImp implements CarService {
    private final CarRepository repository;

    @Override
    public ResponseEntity<CreateCarResponse> createCar(CreateCarRequest createCarRequest) {
//        try {
            Car car = CarMapper.INSTANCE.mapCreateRequestToCar(createCarRequest);
            car = repository.save(car);
            CreateCarResponse response = CarMapper.INSTANCE.mapCarToCreateCarResponse(car);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
    }

    @Override
    public ResponseEntity<List<CarResponse>> getAllCars() {
//        try {
            List<Car> cars = repository.findAll();
//            repository.findAll().forEach(cars::add);
            List<CarResponse> carsResponse = CarMapper.INSTANCE.mapListCarToResponse(cars);
            return new ResponseEntity<>(carsResponse, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
    }

    @Override
    public ResponseEntity<CarResponse> getCarById(UUID id) {
        // check if id is existed or not
        Optional<Car> carData = repository.findById(id);
        if (carData.isPresent()) {
            CarResponse car = CarMapper.INSTANCE.mapCarToCarResponse(carData.get());
            return new ResponseEntity<>(car, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<UpdateCarResponse> updateCar(UUID id, UpdateCarRequest updateCarRequest) {
        Car carData = repository.findById(id).orElse(null);
        if (carData != null) {
            Car car = repository.save(CarMapper.INSTANCE.mapUpdateRequestToCar(updateCarRequest));
            UpdateCarResponse res = CarMapper.INSTANCE.mapCarToUpdateCarResponse(car);
            return new ResponseEntity<>(res, HttpStatus.OK);

        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<HttpStatus> deleteCar(UUID id) {
//        try {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
    }

}
