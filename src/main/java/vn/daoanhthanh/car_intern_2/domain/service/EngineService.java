package vn.daoanhthanh.car_intern_2.domain.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import vn.daoanhthanh.car_intern_2.domain.model.request.CreateEngineRequest;
import vn.daoanhthanh.car_intern_2.domain.model.request.UpdateEngineRequest;
import vn.daoanhthanh.car_intern_2.domain.model.response.CreateEngineResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.EngineResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.UpdateEngineResponse;

import java.util.List;
import java.util.UUID;

public interface EngineService {
    ResponseEntity<CreateEngineResponse> createEngine(CreateEngineRequest createEngineRequest);

    ResponseEntity<List<EngineResponse>> getAllEngines();

    ResponseEntity<EngineResponse> getEngineById(UUID id);

    // List<Engine> getEngineByNameLike(String name);
    //
    // List<Engine> getEngineByOwner(UUID ownerId);

    ResponseEntity<UpdateEngineResponse> updateEngine(UUID id, UpdateEngineRequest updateEngineRequest);

    ResponseEntity<HttpStatus> deleteEngine(UUID id);
}
