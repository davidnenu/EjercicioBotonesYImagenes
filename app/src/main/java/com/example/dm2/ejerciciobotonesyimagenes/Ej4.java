package com.example.dm2.ejerciciobotonesyimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Ej4 extends AppCompatActivity {


        private EditText numero;
        private EditText letra;
        private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej4);

        numero=(EditText)findViewById(R.id.dni);
        letra=(EditText)findViewById(R.id.letra);
        tv=(TextView)findViewById(R.id.validaciondni);

    }
    public void Validar(View v){
        String s = numero.getText().toString()+letra.getText().toString();
        if(comprobar(s))
            tv.setText("Correcto");
        else
            tv.setText("Incorrecto");


    }
    public static boolean comprobar(String fulldni){

        // Array con las letras posibles del dni en su posición
        char[] letraDni = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        String num= "";
        int ind = 0;

        // boolean que nos indicara si es un dni correcto o no
        boolean valido;

        // existen dnis con 7 digitos numericos, si fuese el caso
        // le añado un cero al principio
        if(fulldni.length() == 8) {
            fulldni = "0" + fulldni;
        }

        // compruebo que el 9º digito es una letra
        if (!Character.isLetter(fulldni.charAt(8))) {
            return false;
        }

        // compruebo su longitud que sea 9
        if (fulldni.length() != 9){
            return false;
        }

        // Compruebo que lo 8 primeros digitos sean numeros
        for (int i=0; i<8; i++) {

            if(!Character.isDigit(fulldni.charAt(i))){
                return false;
            }
            // si es numero, lo recojo en un String
            num += fulldni.charAt(i);
        }

        // paso a int el string donde tengo el numero del dni
        ind = Integer.parseInt(num);

        // calculo la posición de la letra en el array que corresponde a este dni
        ind %= 23;

        // verifico que la letra del dni corresponde con la del array
        if ((Character.toUpperCase(fulldni.charAt(8))) != letraDni[ind]){
            return false;
        }
        // si el flujo de la funcion llega aquí, es que el dni es correcto
        return true;
    } // fin comprobar
}
