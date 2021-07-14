package vn.daoanhthanh.car_intern_2.domain.model.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import vn.daoanhthanh.car_intern_2.domain.model.entity.dtos.EngineDTO;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class UpdateEngineResponse extends EngineDTO {
    private UUID id;
    private LocalDateTime updatedAt;
}
