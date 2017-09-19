package com.example.apprenti.objet;

/**
 * Created by apprenti on 18/09/17.
 */

public class Vehicle {
    public String marque;
    public String modele;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Vehicle(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    public String getDescription() {
        return String.format("Marque: %1$s, Modèle: %2$s", marque, modele);
    }



}

