package com.example.dm2.ejerciciobotonesyimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ej2 extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private TextView r;
    private Button b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej2);

        n1=(EditText) findViewById(R.id.valor1);
        n2=(EditText) findViewById(R.id.valor2);
        r=(TextView) findViewById(R.id.resul);
    }
    public void calcular(View v){

        b=(Button)findViewById(v.getId());
        //r.setText(String.valueOf("Has pulsado: "+b.getText()));
        int total;
        switch(b.getText().toString()) {
            case "+":
                total = Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());
                r.setText(String.valueOf(total));
                break;
            case "-":
                total = Integer.parseInt(n1.getText().toString())-Integer.parseInt(n2.getText().toString());
                r.setText(String.valueOf(total));
                break;
            case "*":
                total = Integer.parseInt(n1.getText().toString())*Integer.parseInt(n2.getText().toString());
                r.setText(String.valueOf(total));
                break;
            case "/":
                total = Integer.parseInt(n1.getText().toString())/Integer.parseInt(n2.getText().toString());
                r.setText(String.valueOf(total));
                break;
            default:
                break;
        }
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);

    }
}
