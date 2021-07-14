 package vn.daoanhthanh.car_intern_2.domain.model.entity.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EngineDTO {
    private String engineCode;

    private short horsePower;

    private String manufacturer;

    private boolean isQualified;

}
