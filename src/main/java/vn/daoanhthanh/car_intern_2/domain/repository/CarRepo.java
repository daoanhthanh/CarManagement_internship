package vn.daoanhthanh.car_intern_2.domain.repository;

import java.util.UUID;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vn.daoanhthanh.car_intern_2.domain.model.entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, UUID> {
    // @Query(nativeQuery = true, value = "SELECT * FROM cars c INNER JOIN owners o
    // ON c.")
    // List<Car> findCarByNameLike(String name);
    //
    // List<Car> findCa(UUID ownerId);
}
