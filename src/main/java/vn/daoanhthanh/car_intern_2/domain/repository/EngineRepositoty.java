package vn.daoanhthanh.car_intern_2.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.daoanhthanh.car_intern_2.domain.model.entity.Engine;

import java.util.UUID;

@Repository
public interface EngineRepositoty extends JpaRepository<Engine, UUID> {

}
