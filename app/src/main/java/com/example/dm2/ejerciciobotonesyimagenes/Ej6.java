package com.example.dm2.ejerciciobotonesyimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Ej6 extends AppCompatActivity {
    ToggleButton tb;
    Switch sw;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej6);
    }

    public void mostrarSwitch(View v) {
        sw = (Switch) findViewById(v.getId());
        if (sw.getId() == R.id.switch1) {
            if (sw.isChecked()) {
                img = (ImageView) findViewById(R.id.camara1);
                img.setVisibility(View.VISIBLE);
            } else {
                img = (ImageView) findViewById(R.id.camara1);
                img.setVisibility(View.INVISIBLE);
            }
        } if (sw.getId() == R.id.switch2) {
            if (sw.isChecked()) {
                img = (ImageView) findViewById(R.id.luz1);
                img.setImageResource(R.drawable.luzon);
            } else {
                img = (ImageView) findViewById(R.id.luz1);
                img.setImageResource(R.drawable.luz);
            }

        }

    }



    public void mostrarToggle(View v){
        tb = (ToggleButton) findViewById(v.getId());
        if (tb.getId() == R.id.toggle1) {
            if (tb.isChecked()) {
                img = (ImageView) findViewById(R.id.camara2);
                img.setVisibility(View.VISIBLE);
            } else {
                img = (ImageView) findViewById(R.id.camara2);
                img.setVisibility(View.INVISIBLE);
            }
        } if (tb.getId() == R.id.toggle2) {
            if (tb.isChecked()) {
                img = (ImageView) findViewById(R.id.luz2);
                img.setImageResource(R.drawable.luzon);
            } else {
                img = (ImageView) findViewById(R.id.luz2);
                img.setImageResource(R.drawable.luz);
            }

        }

    }

    }

