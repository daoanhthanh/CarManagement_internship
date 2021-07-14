package vn.daoanhthanh.car_intern_2.domain.model.response;

import lombok.*;
import vn.daoanhthanh.car_intern_2.domain.model.entity.dtos.EngineDTO;

import java.time.LocalDateTime;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class CreateEngineResponse extends EngineDTO {
    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
