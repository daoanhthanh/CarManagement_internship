package vn.daoanhthanh.car_intern_2.base.mapper.car;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import vn.daoanhthanh.car_intern_2.domain.model.dto.CreateCarDTO;
import vn.daoanhthanh.car_intern_2.domain.model.dto.UpdateCarDTO;
import vn.daoanhthanh.car_intern_2.domain.model.entity.Car;

@Mapper
//@Component
public interface CreateCarRequestMapper {
    CreateCarRequestMapper INSTANCE = Mappers.getMapper(CreateCarRequestMapper.class);

    // create mapping
//    @Bean
    Car createRequestToCar(CreateCarDTO createCarDTO);

    CreateCarDTO carToCreateResponseDTO(Car car);

    // update mapping
    Car updateRequestToCar(UpdateCarDTO updateCarDTO);

    UpdateCarDTO carToUpdateResponse(Car car);

}
