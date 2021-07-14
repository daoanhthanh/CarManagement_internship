package vn.daoanhthanh.car_intern_2.domain.model.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import vn.daoanhthanh.car_intern_2.domain.model.entity.dtos.EngineDTO;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class CreateEngineRequest extends EngineDTO {
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
