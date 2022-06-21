package repository;

import model.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
    List<Vehicle> findByColor(String color);
}
