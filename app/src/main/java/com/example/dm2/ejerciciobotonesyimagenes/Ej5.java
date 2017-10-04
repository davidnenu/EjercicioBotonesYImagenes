package com.example.dm2.ejerciciobotonesyimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ej5 extends AppCompatActivity {

    ImageView navegador;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej5);
    }

    public void imagen(View v){
        b=(Button)findViewById(v.getId());
        navegador=(ImageView)findViewById(R.id.imagenNavegador);
        if(b.getText().toString().equals("GOOGLE"))
            navegador.setImageResource(R.drawable.google);

    }

}
