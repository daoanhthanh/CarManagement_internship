package vn.daoanhthanh.car_intern_2.domain.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vn.daoanhthanh.car_intern_2.base.TimeStamps;
import vn.daoanhthanh.car_intern_2.domain.model.entity.component.CarType;
import vn.daoanhthanh.car_intern_2.domain.model.entity.component.Transmission;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

// import lombok.AllArgsConstructor;
// import lombok.NoArgsConstructor;

// @AllArgsConstructor
// @NoArgsConstructor
@Entity(name = "cars")
@Getter
@Setter
@ToString
@Builder(toBuilder = true)
public class Car implements TimeStamps {
    @Id
    // @GenericGenerator(name = "UUIDGenerator", strategy = "UUID2")
    // @GeneratedValue(generator = "UUIDGenerator")

    @Column(updatable = false, nullable = false)
    private UUID id;
    private String model;
    private CarType carType;
    private int seat;
    private String registrationNumber;
    private int cylinderCapacity;
    private Transmission transmission;
    private UUID engineID;
    private UUID ownerID;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Car(UUID id, String model, CarType carType, int seat, String registrationNumber, int cylinderCapacity,
            Transmission transmission, UUID engineID, UUID ownerID, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.model = model;
        this.carType = carType;
        this.seat = seat;
        this.registrationNumber = registrationNumber;
        this.cylinderCapacity = cylinderCapacity;
        this.transmission = transmission;
        this.engineID = engineID;
        this.ownerID = ownerID;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Car(String model, CarType carType, int seat, String registrationNumber, int cylinderCapacity,
            Transmission transmission, UUID engineID, UUID ownerID, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.model = model;
        this.carType = carType;
        this.seat = seat;
        this.registrationNumber = registrationNumber;
        this.cylinderCapacity = cylinderCapacity;
        this.transmission = transmission;
        this.engineID = engineID;
        this.ownerID = ownerID;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}
