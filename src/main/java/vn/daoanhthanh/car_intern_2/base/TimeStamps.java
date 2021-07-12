package vn.daoanhthanh.car_intern_2.base;

import java.time.LocalDateTime;

public interface TimeStamps {
    LocalDateTime getCreatedAt();

    void setCreatedAt(LocalDateTime createdAt);

    LocalDateTime getUpdatedAt();

    void setUpdatedAt(LocalDateTime updatedAt);

}
