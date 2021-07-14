package vn.daoanhthanh.car_intern_2.domain.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import vn.daoanhthanh.car_intern_2.domain.model.entity.dtos.EngineDTO;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class UpdateEngineRequest extends EngineDTO {
    private UUID id;
    private final LocalDateTime updatedAt = LocalDateTime.now();
}
