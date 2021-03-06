package vn.daoanhthanh.car_intern_2.domain.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import vn.daoanhthanh.car_intern_2.domain.model.entity.dtos.CarDTO;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class CreateCarRequest extends CarDTO {
    private final LocalDateTime createdAt = LocalDateTime.now();
    private final LocalDateTime updatedAt = LocalDateTime.now();
}
