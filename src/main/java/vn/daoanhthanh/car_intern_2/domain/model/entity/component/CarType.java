package vn.daoanhthanh.car_intern_2.domain.model.entity.component;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CarType {
    @JsonProperty("SPORT CAR")
    SPORT, @JsonProperty("CITY CAR")
    CITY, SUV, SEDAN
}
