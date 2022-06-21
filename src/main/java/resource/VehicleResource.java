package resource;

import model.Vehicle;
import repository.VehicleRepository;

import javax.ws.rs.*;
import java.util.List;
import java.util.Optional;

@Path("/api/v1/vehicle")
public class VehicleResource {
    private final VehicleRepository vehicleRepository;

    public VehicleResource(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @GET
    @Path("{id}")
    public Vehicle findById(Long id){
        return vehicleRepository.findById(id).get();
    }

    @GET
    public Iterable<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @DELETE
    @Path("{id}")
    public void delete(long id) {
        vehicleRepository.deleteById(id);
    }

    @POST
    @Path("")
    public Vehicle create(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @PUT
    @Path("{id}")
    public Vehicle changeColor(Long id, Vehicle vehicleDTO) {
        Optional<Vehicle> optional = vehicleRepository.findById(id);
        if (optional.isPresent()) {
            Vehicle vehicle = optional.get();
            vehicle.setBrand(vehicleDTO.getBrand());
            vehicle.setModel(vehicleDTO.getModel());
            vehicle.setFuelType(vehicleDTO.getFuelType());
            vehicle.setColor(vehicleDTO.getColor());
            vehicle.setPower(vehicleDTO.getPower());
            vehicle.setTorque(vehicleDTO.getTorque());
            vehicle.setMaximumSpeed(vehicleDTO.getMaximumSpeed());
            vehicle.setNumberOfDoors(vehicleDTO.getNumberOfDoors());

            return vehicleRepository.save(vehicle);
        }

        throw new IllegalArgumentException("No Fruit with id " + id + " exists");
    }

    @GET
    @Path("/color/{color}")
    public List<Vehicle> findByColor(String color) {
        return vehicleRepository.findByColor(color);
    }
}
