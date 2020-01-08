package com.quitulabs.quitupark.Repository;

import com.quitulabs.quitupark.Domain.ParkingPlace;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingRepository {

    public List<ParkingPlace> GetParkingPlace();

}
