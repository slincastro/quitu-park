package com.quitulabs.quitupark.Domain;

import java.util.List;

public class ParkingLot {

    Integer Id;
    String Name;
    List<ParkingPlace> parkingPlace;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<ParkingPlace> getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(List<ParkingPlace> parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

}
