package com.quitulabs.quitupark.Domain;

public class ParkingPlace {
    String placeType;
    Integer placeNumber;
    Boolean placeAvailable;

    public Integer getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(Integer placeNumber) {
        this.placeNumber = placeNumber;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public Boolean getPlaceAvailable() {
        return placeAvailable;
    }

    public void setPlaceAvailable(Boolean placeAvailable) {
        this.placeAvailable = placeAvailable;
    }

}
