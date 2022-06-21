package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String fuelType;
    private String color;
    private Float power;
    private Float torque;
    private Long maximumSpeed;
    private Integer numberOfDoors;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, String fuelType, String color, Float power, Float torque, Long maximumSpeed, Integer numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.color = color;
        this.power = power;
        this.torque = torque;
        this.maximumSpeed = maximumSpeed;
        this.numberOfDoors = numberOfDoors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    public Float getTorque() {
        return torque;
    }

    public void setTorque(Float torque) {
        this.torque = torque;
    }

    public Long getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(Long maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
