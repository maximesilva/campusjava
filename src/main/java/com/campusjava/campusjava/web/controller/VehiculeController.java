package com.campusjava.campusjava.web.controller;
import com.campusjava.campusjava.model.Vehicule;
import com.campusjava.campusjava.model.VehiculeForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculeController {

    private static List<Vehicule> vehicules = new ArrayList<Vehicule>();

    static {
        vehicules.add(new Vehicule(1, "Ferrari", "Italia", "red"));
        vehicules.add(new Vehicule(2, "Ferrari", "Enerve", "blue"));
        vehicules.add(new Vehicule(3, "Ferrari", "Defonce", "yellow"));
    }

    @RequestMapping(value="/vehicules", method= RequestMethod.GET)
    public String listeVehicules(Model model) {

        model.addAttribute("vehicules", vehicules);

        return "vehicules";
    }

    @GetMapping(value = "/vehicules/{id}")
    public Vehicule afficherUnVehicule(@PathVariable int id) {
        Vehicule vehicule = new Vehicule(id, new String("Grosse féfé"), "italia", "red" );
        return vehicule;
    }

    @RequestMapping(value = { "/addVehicule" }, method = RequestMethod.GET)
    public String showVehiculePage(Model model) {

        VehiculeForm vehiculeForm = new VehiculeForm();
        model.addAttribute("vehiculeForm", vehiculeForm);

        return "addVehicule";
    }

    @RequestMapping(value = { "/addVehicule" }, method = RequestMethod.POST)
    public String saveVehicule(Model model, //
     @ModelAttribute("vehiculeForm") VehiculeForm vehiculeForm) {

        int id = vehiculeForm.getId();
        String brand = vehiculeForm.getBrand();
        String modele = vehiculeForm.getModele();
        String color = vehiculeForm.getColor();

        Vehicule newVehicule = new Vehicule(id, brand, modele, color);
        vehicules.add(newVehicule);

        return "redirect:/vehicules";

    }
}
