package com.campusjava.campusjava.service;

import com.campusjava.campusjava.model.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculeService extends JpaRepository<Vehicule, Integer> {

    Vehicule findById(int id);
    List<Vehicule> findByPrixGreaterThan(int prixLimit);
    List<Vehicule> findByBrandLike(String recherche);
}
