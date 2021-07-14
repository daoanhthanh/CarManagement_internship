package vn.daoanhthanh.car_intern_2.domain.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import vn.daoanhthanh.car_intern_2.domain.model.entity.dtos.EngineDTO;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class EngineResponse extends EngineDTO {
    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
