package com.campusjava.campusjava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Vehicule {

    @Id
    @GeneratedValue
    private int id;
    private String brand;
    private String modele;
    private String color;

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @JsonIgnore
    private int prix;

    //constructeur par défaut
    public Vehicule() {
    }

    //constructeur pour nos tests

    public Vehicule(int id, String brand, String modele, String color) {
        this.id=id;
        this.brand=brand;
        this.modele=modele;
        this.color=color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand=brand;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String model) {
        this.modele=model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public String toString(){
        return "Vehicule{"+
                "id=" + id +
                ", marque ='"+ brand + '\'' +
                ", modèle =" + modele + '}' +
                ", color =" + color + '}';
    }
}