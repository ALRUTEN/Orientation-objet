package com.example.apprenti.objet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import static com.example.apprenti.objet.R.id.Marque;
import static com.example.apprenti.objet.R.id.Modele;

public class MainActivity extends AppCompatActivity {

    Spinner type1;
    int type =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.spinnerList);
        final EditText marque = (EditText) findViewById(Marque);
        final EditText modele = (EditText) findViewById(R.id.Modele);
        final EditText km = (EditText) findViewById(R.id.KM);
        final EditText heure = (EditText) findViewById(R.id.Heure);
        final Button button = (Button) findViewById(R.id.button);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Vehicule    , android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                type=i;
                if (i==0){
                    km.setVisibility(View.INVISIBLE);
                    heure.setVisibility(View.INVISIBLE);
                    button.setEnabled(false);

                }
                if (i == 1){
                    km.setVisibility(View.VISIBLE);
                    heure.setVisibility(View.INVISIBLE);
                    button.setEnabled(true);

                }
                if (i==2){
                    km.setVisibility(View.INVISIBLE);
                    heure.setVisibility(View.VISIBLE);
                    button.setEnabled(true);

                if (i==3){
                    marque.setVisibility(View.INVISIBLE);
                    modele.setVisibility(View.VISIBLE);
                    button.setEnabled(true);
                }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, VehicleActivity.class);
                intent.putExtra("marque", marque.getText().toString());
                intent.putExtra("modele", modele.getText().toString());
                intent.putExtra("km", km.getText().toString());
                intent.putExtra("heure", heure.getText().toString());
                intent.putExtra("type", spinner.getSelectedItemPosition());

                startActivity(intent);

            }
        });

    }


}
