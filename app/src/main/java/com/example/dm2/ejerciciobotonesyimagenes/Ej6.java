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

    public void mostrar(View v){

        if(findViewById(v.getId()).toString().equals("toggle1")){
            img=(ImageView)findViewById(R.id.camara1);
            img.setImageResource(R.drawable.camara);
        }

    }
}
