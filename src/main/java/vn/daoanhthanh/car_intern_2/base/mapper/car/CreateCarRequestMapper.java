package vn.daoanhthanh.car_intern_2.base.mapper.car;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import vn.daoanhthanh.car_intern_2.domain.model.dto.CreateCarDTO;
import vn.daoanhthanh.car_intern_2.domain.model.dto.UpdateCarDTO;
import vn.daoanhthanh.car_intern_2.domain.model.entity.Car;

@Mapper
public interface CreateCarRequestMapper {
    CreateCarRequestMapper INSTANCE = Mappers.getMapper(CreateCarRequestMapper.class);

    // create mapping
    Car createRequestToCar(CreateCarDTO createCarDTO);

    CreateCarDTO carToCreateResponseDTO(Car car);

    // update mapping
    Car updateRequestToCar(UpdateCarDTO updateCarDTO);

    UpdateCarDTO carToUpdateResponse(Car car);

}
