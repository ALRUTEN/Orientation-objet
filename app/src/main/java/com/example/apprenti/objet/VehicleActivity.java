package com.example.apprenti.objet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class VehicleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);
        int type = getIntent().getIntExtra("type", 0);
        String marque = getIntent().getStringExtra("marque");
        String modele = getIntent().getStringExtra("modele");
        String km = getIntent().getStringExtra("km");
        String heure = getIntent().getStringExtra("heure");
        TextView result = (TextView) findViewById(R.id.description);


        if (type == 1) {
            VehicleCar car = new VehicleCar(marque, modele, km);
            result.setText(car.getDescription());
        } else if (type == 2) {
            VehicleCar boat = new VehicleCar(marque, modele, km);
            result.setText(boat.getDescription());
        } else {
        }
    }
}
