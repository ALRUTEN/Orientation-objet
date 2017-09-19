package com.example.apprenti.objet;

/**
 * Created by apprenti on 18/09/17.
 */

public class BoatVehicle extends Vehicle {

    public BoatVehicle(String marque, String modele) {
        super(marque, modele);
    }

    public String getHeures() {
        return heures;
    }

    public void setHeures(String heures) {
        this.heures = heures;
    }

    private String heures;

    public String getDescription() {
        return String.format("Marque: %1$s, Modèle: %2$s,heures: %3$s", marque, modele, heures);
    }

}

