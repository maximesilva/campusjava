package com.campusjava.campusjava.web.controller;
import com.campusjava.campusjava.model.Vehicule;
import com.campusjava.campusjava.model.VehiculeForm;
import com.campusjava.campusjava.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehiculeController {

    @Autowired
    private VehiculeService vehiculeService;

    //Récupérer la liste des véhicules
    @RequestMapping(value="/vehicules", method=RequestMethod.GET)
    public List<Vehicule> allVehicules() {
        return vehiculeService.getAllVehicule();
    }

    //Récupérer un véhicule par son Id
    @GetMapping(value="/vehicules/{id}")
    public Vehicule showOneVehicule(@PathVariable int id) {
        return vehiculeService.getOneVehicule(id);
    }

    @PostMapping(value="/vehicules")
    public void addVehicule(@RequestBody Vehicule vehicule) {
        vehiculeService.addVehicule(vehicule);
    }

    @PutMapping(value = "/vehicules/{id}")
    public void updateVehicule(@PathVariable int id, @RequestBody Vehicule vehicule){
        vehiculeService.updateVehicule(id, vehicule);
    }


    @DeleteMapping(value="/vehicules/{id}")
    public void deleteVehicule(@PathVariable int id) {
        vehiculeService.deleteVehicule(id);
    }
}
