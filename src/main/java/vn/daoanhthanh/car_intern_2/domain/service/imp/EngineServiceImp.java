package vn.daoanhthanh.car_intern_2.domain.service.imp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import vn.daoanhthanh.car_intern_2.domain.model.request.CreateEngineRequest;
import vn.daoanhthanh.car_intern_2.domain.model.request.UpdateEngineRequest;
import vn.daoanhthanh.car_intern_2.domain.model.response.CreateEngineResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.EngineResponse;
import vn.daoanhthanh.car_intern_2.domain.model.response.UpdateEngineResponse;
import vn.daoanhthanh.car_intern_2.domain.service.EngineService;

import java.util.List;
import java.util.UUID;

public class EngineServiceImp implements EngineService {
    @Override
    public ResponseEntity<CreateEngineResponse> createEngine(CreateEngineRequest createEngineRequest) {
        return null;
    }

    @Override
    public ResponseEntity<List<EngineResponse>> getAllEngines() {
        return null;
    }

    @Override
    public ResponseEntity<EngineResponse> getEngineById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<UpdateEngineResponse> updateEngine(UUID id, UpdateEngineRequest updateEngineRequest) {
        return null;
    }

    @Override
    public ResponseEntity<HttpStatus> deleteEngine(UUID id) {
        return null;
    }
}
