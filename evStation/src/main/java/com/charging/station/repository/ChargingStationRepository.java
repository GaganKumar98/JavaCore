package com.charging.station.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charging.station.model.ChargingStation;

public interface ChargingStationRepository extends JpaRepository<ChargingStation, Long> {
}