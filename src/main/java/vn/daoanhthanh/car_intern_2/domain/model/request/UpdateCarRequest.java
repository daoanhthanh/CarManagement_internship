package vn.daoanhthanh.car_intern_2.domain.model.request;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Local;
import vn.daoanhthanh.car_intern_2.domain.model.entity.dtos.CarDTO;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest extends CarDTO {
    private UUID id;
    private final LocalDateTime updatedAt = LocalDateTime.now();
}
