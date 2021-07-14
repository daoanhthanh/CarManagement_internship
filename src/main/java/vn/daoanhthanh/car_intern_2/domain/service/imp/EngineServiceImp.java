package vn.daoanhthanh.car_intern_2.domain.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import vn.daoanhthanh.car_intern_2.base.EngineMapper;
import vn.daoanhthanh.car_intern_2.domain.model.entity.Engine;
import vn.daoanhthanh.car_intern_2.domain.model.request.CreateEngineRequest;
import vn.daoanhthanh.car_intern_2.domain.model.request.UpdateEngineRequest;
import vn.daoanhthanh.car_intern_2.domain.model.response.*;
import vn.daoanhthanh.car_intern_2.domain.repository.EngineRepository;
import vn.daoanhthanh.car_intern_2.domain.service.EngineService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EngineServiceImp implements EngineService {
    private final EngineRepository repository;

    @Override
    public ResponseEntity<CreateEngineResponse> createEngine(CreateEngineRequest createEngineRequest) {
        var engine = EngineMapper.INSTANCE.mapCreateRequestToEngine(createEngineRequest);
        engine = repository.save(engine);
        CreateEngineResponse response = EngineMapper.INSTANCE.mapEngineToCreateEngineResponse(engine);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<EngineResponse>> getAllEngines() {
        List<Engine> engines = repository.findAll();
        List<EngineResponse> response = EngineMapper.INSTANCE.mapListEngineToResponse(engines);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EngineResponse> getEngineById(UUID id) {
        // check if id is existed or not
        Optional<Engine> engineData = repository.findById(id);
        if (engineData.isPresent()) {
            EngineResponse response = EngineMapper.INSTANCE.mapEngineToEngineResponse(engineData.get());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<UpdateEngineResponse> updateEngine(UUID id, UpdateEngineRequest updateEngineRequest) {
        Optional<Engine> engineData = repository.findById(id);
        if (engineData.isPresent()) {
            Engine engine = repository.save(EngineMapper.INSTANCE.mapUpdateRequestToEngine(updateEngineRequest));
            UpdateEngineResponse res = EngineMapper.INSTANCE.mapEngineToUpdateEngineResponse(engine);
            return new ResponseEntity<>(res, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<HttpStatus> deleteEngine(UUID id) {
        repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
