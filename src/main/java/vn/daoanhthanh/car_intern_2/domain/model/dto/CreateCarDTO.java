package vn.daoanhthanh.car_intern_2.domain.model.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CreateCarDTO extends CarDTO {

    // TODO: note this senario
    private final LocalDateTime createdAt = LocalDateTime.now();
    private final LocalDateTime updatedAt = LocalDateTime.now();
}
