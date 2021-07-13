package vn.daoanhthanh.car_intern_2.domain.model.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.daoanhthanh.car_intern_2.domain.model.entity.component.CarType;
import vn.daoanhthanh.car_intern_2.domain.model.entity.component.Transmission;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private String model;
    private CarType carType;
    private int seat;
    private String registrationNumber;
    private int cylinderCapacity;
    private Transmission transmission;
    private UUID engineID;
    private UUID ownerID;
}
