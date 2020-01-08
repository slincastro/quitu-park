package com.quitulabs.quitupark.Service;

import com.quitulabs.quitupark.Repository.ParkingRepository;


public class ParkingService {

    ParkingRepository parkingRepository;

    public ParkingService(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    public Integer getAvailablePlaces() {
        int totalAvailableParkingPlaces = 10;

        Integer placeTake = parkingRepository.GetParkingPlace().size();

        return totalAvailableParkingPlaces -placeTake;
    }
}
