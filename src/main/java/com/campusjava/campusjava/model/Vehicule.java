package com.campusjava.campusjava.model;

public class Vehicule {
    private int id;
    private String brand;
    private String modele;
    private String color;

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