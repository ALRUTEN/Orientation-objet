package com.example.apprenti.objet;

/**
 * Created by apprenti on 18/09/17.
 */

public class VehicleCar extends Vehicle {

    public VehicleCar(String marque, String modele, String kilomètres) {
        super(marque, modele);
        Kilomètres = kilomètres;
    }

    private String Kilomètres;

    public String getKilomètres() {
        return Kilomètres;
    }

    public void setKilomètres(String kilomètres) {
        Kilomètres = kilomètres;
    }

    public String getDescription() {
        return String.format("Marque: %1$s, Modèle: %2$s,Kilomètres: %3$s", marque, modele, Kilomètres);
    }
}
