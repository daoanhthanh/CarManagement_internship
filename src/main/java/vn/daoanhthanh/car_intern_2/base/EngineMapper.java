package vn.daoanhthanh.car_intern_2.base;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import vn.daoanhthanh.car_intern_2.domain.model.entity.Engine;
import vn.daoanhthanh.car_intern_2.domain.model.request.CreateEngineRequest;
import vn.daoanhthanh.car_intern_2.domain.model.request.UpdateEngineRequest;
import vn.daoanhthanh.car_intern_2.domain.model.response.CreateEngineResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.EngineResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.UpdateEngineResponse;


import java.util.List;
@Mapper
public interface EngineMapper {

    EngineMapper INSTANCE = Mappers.getMapper(EngineMapper.class);
    // create
    Engine mapCreateRequestToEngine(CreateEngineRequest createEngineRequest);

    CreateEngineResponse mapEngineToCreateEngineResponse(Engine engine);

    // update
    Engine mapUpdateRequestToEngine(UpdateEngineRequest updateEngineRequest);

    UpdateEngineResponse mapEngineToUpdateEngineResponse(Engine engine);

    List<EngineResponse> mapListEngineToResponse(List<Engine> engines);

    EngineResponse mapEngineToEngineResponse(Engine engine);
}
