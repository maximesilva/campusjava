package com.campusjava.campusjava.service;

import com.campusjava.campusjava.model.Vehicule;

import java.util.List;

public interface VehiculeService {
    Vehicule getOneVehicule(int vehiculeId);
    void addVehicule(Vehicule vehicule);
    void updateVehicule(int id, Vehicule newVehicule);
    List<Vehicule> getAllVehicule();
    void deleteVehicule(int id);
}
