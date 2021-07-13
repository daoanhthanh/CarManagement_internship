package vn.daoanhthanh.car_intern_2.domain.model.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class UpdateCarDTO extends CarDTO {
    private final LocalDateTime updatedAt = LocalDateTime.now();
}
