package com.example.dm2.ejerciciobotonesyimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class Ej1 extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private TextView r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej1);

        n1=(EditText) findViewById(R.id.valor1);
        n2=(EditText) findViewById(R.id.valor2);
        r=(TextView) findViewById(R.id.resul);

    }
    public void Calcular(View v){

        int total = Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());
        r.setText(String.valueOf(total));

        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);

    }

}
