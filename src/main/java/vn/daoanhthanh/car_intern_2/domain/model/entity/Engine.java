package vn.daoanhthanh.car_intern_2.domain.model.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import vn.daoanhthanh.car_intern_2.base.TimeStamps;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "engines")
public class Engine implements TimeStamps {
    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private UUID id;

    private String engineCode;

    private short horsePower;

    private String manufacturer;

    private boolean isQualified;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
