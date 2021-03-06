package vn.daoanhthanh.car_intern_2.domain.model.response;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
// import lombok.ToString;
import lombok.NoArgsConstructor;
import vn.daoanhthanh.car_intern_2.domain.model.entity.dtos.CarDTO;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// @ToString
public class CreateCarResponse extends CarDTO {
    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
