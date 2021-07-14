package vn.daoanhthanh.car_intern_2.base;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import vn.daoanhthanh.car_intern_2.domain.model.entity.Car;
import vn.daoanhthanh.car_intern_2.domain.model.request.CreateCarRequest;
import vn.daoanhthanh.car_intern_2.domain.model.request.UpdateCarRequest;
import vn.daoanhthanh.car_intern_2.domain.model.response.CarResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.CreateCarResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.UpdateCarResponse;

@Mapper
// @Component
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
    // create
    Car mapCreateRequestToCar(CreateCarRequest createCarRequest);

    CreateCarResponse mapCarToCreateCarResponse(Car car);

    // update
    Car mapUpdateRequestToCar(UpdateCarRequest updateCarRequest);

    UpdateCarResponse mapCarToUpdateCarResponse(Car car);

    List<CarResponse> mapListCarToResponse(List<Car> cars);

    CarResponse mapCarToCarResponse(Car car);

} 
