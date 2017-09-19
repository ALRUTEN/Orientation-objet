package com.example.apprenti.objet;

/**
 * Created by apprenti on 18/09/17.
 */

public class Moto extends Vehicle {

    public Moto(String marque, String modele) {
        super(marque, modele);
    }

    public String getDescription() {
        return String.format("Marque: %1$s, Modèle: %2$s,heures: %3$s", marque, modele);
    }
}
