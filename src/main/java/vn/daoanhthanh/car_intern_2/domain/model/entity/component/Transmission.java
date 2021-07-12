package vn.daoanhthanh.car_intern_2.domain.model.entity.component;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Just a car component
 */
public enum Transmission {
    @JsonProperty("SINGLE SPEED")
    SINGLE_SPEED, MANUAL, AUTOMATIC, @JsonProperty("SEMI AUTOMATIC")
    SEMI_AUTOMATIC
}
