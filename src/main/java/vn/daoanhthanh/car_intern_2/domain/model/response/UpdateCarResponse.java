package vn.daoanhthanh.car_intern_2.domain.model.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import vn.daoanhthanh.car_intern_2.domain.model.entity.dtos.CarDTO;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class UpdateCarResponse extends CarDTO {
    private UUID id;
    private LocalDateTime updatedAt;
}
