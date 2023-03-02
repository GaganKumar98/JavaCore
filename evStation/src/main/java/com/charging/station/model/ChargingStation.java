package com.charging.station.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChargingStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stationName;
    private String stationImage;
    private Float stationPricing;
    private String stationAddress;

    public ChargingStation() {}

    public ChargingStation(String stationName, String stationImage, Float stationPricing, String stationAddress) {
        this.stationName = stationName;
        this.stationImage = stationImage;
        this.stationPricing = stationPricing;
        this.stationAddress = stationAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationImage() {
        return stationImage;
    }

    public void setStationImage(String stationImage) {
        this.stationImage = stationImage;
    }

    public Float getStationPricing() {
        return stationPricing;
    }

    public void setStationPricing(Float stationPricing) {
        this.stationPricing = stationPricing;
    }

    public String getStationAddress() {
        return stationAddress;
    }

    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }
}
