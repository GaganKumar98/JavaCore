package com.charging.station.controller;


import com.charging.station.model.ChargingStation;
import com.charging.station.repository.ChargingStationRepository;
import com.charging.station.service.ChargingStationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ChargingStationController {
    @Autowired
    private ChargingStationService chargingStationService;

    @GetMapping
    public List<ChargingStation> getAllChargingStations() {
        return chargingStationService.getAllChargingStations();
    }

    @GetMapping("/{id}")
    public ChargingStation getChargingStationById(@PathVariable Long id) {
        return chargingStationService.getChargingStationById(id);
    }

    @PostMapping
    public ChargingStation addChargingStation(@RequestBody ChargingStation chargingStation) {
        return chargingStationService.addChargingStation(chargingStation);
    }

    @PutMapping("/{id}")
    public ChargingStation updateChargingStation(@PathVariable Long id, @RequestBody ChargingStation chargingStation) {
        return chargingStationService.updateChargingStation(id, chargingStation);
    }

    @DeleteMapping("/{id}")
    public void deleteChargingStation(@PathVariable Long id) {
        chargingStationService.deleteChargingStation(id);
    }
}