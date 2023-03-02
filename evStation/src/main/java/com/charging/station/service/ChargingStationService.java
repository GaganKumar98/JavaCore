package com.charging.station.service;

import java.util.List;

import com.charging.station.model.ChargingStation;

public interface ChargingStationService {
    List<ChargingStation> getAllChargingStations();
    ChargingStation getChargingStationById(Long id);
    ChargingStation addChargingStation(ChargingStation chargingStation);
    ChargingStation updateChargingStation(Long id, ChargingStation chargingStation);
    void deleteChargingStation(Long id);
}
