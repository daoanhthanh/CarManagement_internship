package vn.daoanhthanh.car_intern_2.domain.model.response;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.daoanhthanh.car_intern_2.domain.model.entity.dtos.CarDTO;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarResponse extends CarDTO {
    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
