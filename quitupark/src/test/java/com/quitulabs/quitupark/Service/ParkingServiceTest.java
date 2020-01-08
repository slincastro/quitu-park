package com.quitulabs.quitupark.Service;

import com.quitulabs.quitupark.Domain.ParkingPlace;
import com.quitulabs.quitupark.Repository.ParkingRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class ParkingServiceTest {

    @Mock
    private ParkingRepository parkingRepository;

    @Test
    void shouldGetTenAvailablePlaces() {
        int expectedParkingNumber = 10;

        when(parkingRepository.GetParkingPlace()).thenReturn(new ArrayList<>());

        Integer availablePlaceNumber = new ParkingService(parkingRepository).getAvailablePlaces();

        assertThat(availablePlaceNumber,is(equalTo(expectedParkingNumber)));
    }

    @Test
    void shouldGet8AvailablePlacesWhenHave2TakePlaces(){
        List<ParkingPlace> parkingLotPlaces = new ArrayList<>();
        int expectedParkingPlaces = 8;

        ParkingPlace placeA = new ParkingPlace();
        placeA.setPlaceAvailable(false);
        placeA.setPlaceNumber(1);
        placeA.setPlaceType("Normal");

        ParkingPlace placeB = new ParkingPlace();
        placeB.setPlaceAvailable(false);
        placeB.setPlaceNumber(2);
        placeB.setPlaceType("Normal");

        parkingLotPlaces.add(placeA);
        parkingLotPlaces.add(placeB);

        when(parkingRepository.GetParkingPlace()).thenReturn(parkingLotPlaces);

        Integer availablePlaceNumber = new ParkingService(parkingRepository).getAvailablePlaces();

        assertThat(availablePlaceNumber,is(equalTo(expectedParkingPlaces)));

    }

}