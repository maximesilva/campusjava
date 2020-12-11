package com.campusjava.campusjava.web.controller;
import com.campusjava.campusjava.model.Vehicule;
import com.campusjava.campusjava.service.VehiculeService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehiculeController {

    @Autowired
    private VehiculeService vehiculeService;

    //Récupérer la liste des véhicules
    @RequestMapping(value = "/vehicules", method = RequestMethod.GET)
    public MappingJacksonValue listeVehicules() {
        Iterable<Vehicule> vehicules = vehiculeService.findAll();

        SimpleBeanPropertyFilter monFiltre = SimpleBeanPropertyFilter.serializeAllExcept("prixAchat");

        FilterProvider listDeNosFiltres = new SimpleFilterProvider().addFilter("monFiltreDynamique", monFiltre);

        MappingJacksonValue vehiculesFiltres = new MappingJacksonValue(vehicules);

        vehiculesFiltres.setFilters(listDeNosFiltres);

        return vehiculesFiltres;
    }


    //Récupérer un véhicule par son Id
    @GetMapping(value="/vehicules/{id}")
    public Vehicule showOneVehicule(@PathVariable int id) {
        return vehiculeService.getOne(id);
    }

    @GetMapping(value = "test/vehicules/prix/{prixLimit}")
    public List<Vehicule> testeDeRequetes(@PathVariable int prixLimit) {
        return vehiculeService.findByPrixGreaterThan(prixLimit);
    }

    @PostMapping(value="/vehicules")
    public void addVehicule(@RequestBody Vehicule vehicule) {
        vehiculeService.save(vehicule);
    }

    @GetMapping(value = "test/vehicules/marque/{recherche}")
    public List<Vehicule> testFindByName(@PathVariable String recherche) {
        return vehiculeService.findByBrandLike("%"+recherche+"%");
    }

    @PutMapping(value = "/vehicules")
    public void updateVehicule(@RequestBody Vehicule vehicule){
        vehiculeService.save(vehicule);
    }


    @DeleteMapping(value="/vehicules/{id}")
    public void deleteVehicule(@PathVariable int id) {
        vehiculeService.deleteById(id);
    }
}
