package com.campusjava.campusjava.service;

import com.campusjava.campusjava.model.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehiculeServiceImpl implements VehiculeService {

    private static List<Vehicule> vehicules = new ArrayList<Vehicule>();

    static {
        vehicules.add(new Vehicule(1, "Ferrari", "Italia", "red"));
        vehicules.add(new Vehicule(2, "Ferrari", "Enerve", "blue"));
        vehicules.add(new Vehicule(3, "Ferrari", "Defonce", "yellow"));
    }

    @Override
    public Vehicule getOneVehicule(int id) {
        for (Vehicule vehicule : vehicules) {
            if(vehicule.getId() == id){
                return vehicule;
            }
        }
        return null;
    }

    @Override
    public void addVehicule(Vehicule vehicule) {
        vehicules.add(vehicule);
    }

    @Override
    public List<Vehicule> getAllVehicule() {
        return vehicules;
    }

    @Override
    public void updateVehicule(int id, Vehicule newVehicule) {
        int i = 0;
        for (Vehicule vehicule : vehicules) {
            if(vehicule.getId() == id){
                vehicules.set(i, newVehicule);
            }
            i++;
        }
    }

    @Override
    public void deleteVehicule(int id) {
        int i = 0;
        for (Vehicule vehicule : vehicules) {
            if(vehicule.getId() == id){
                vehicules.remove(i);
            }
            i++;
        }
    }
}


