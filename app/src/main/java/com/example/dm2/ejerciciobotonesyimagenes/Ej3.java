package com.example.dm2.ejerciciobotonesyimagenes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

public class Ej3 extends AppCompatActivity {

    private ToggleButton b;
    private ToggleButton btnAmarillo;
    private ToggleButton btnGris;
    private RelativeLayout fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej3);

        btnAmarillo=(ToggleButton)findViewById(R.id.BtnSW1);
        btnGris=(ToggleButton)findViewById(R.id.BtnSW2);
        fondo = (RelativeLayout)findViewById(R.id.ejercicio3);
    }
    public void Cambiar(View v){
        b=(ToggleButton)findViewById(v.getId());
        switch(b.getText().toString()) {
            case "Amarillo":
                if(btnAmarillo.isChecked()) {
                    btnGris.setChecked(false);
                    fondo.setBackgroundColor(Color.YELLOW);
                }
                else
                    btnAmarillo.setChecked(true);

                break;
            case "Gris":
                if(btnGris.isChecked()) {

                    btnAmarillo.setChecked(false);
                    fondo.setBackgroundColor(Color.GRAY);
                }
                else
                    btnGris.setChecked(true);

                break;


        }

    }
}
