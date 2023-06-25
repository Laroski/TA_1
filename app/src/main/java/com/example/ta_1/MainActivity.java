package com.example.ta_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btborrar (View view)
    {
        EditText Nombre =findViewById(R.id.txtnombres);
        EditText Cedula =findViewById(R.id.textcedula);
        EditText FechaDeNacimiento =findViewById(R.id.calendario);
        EditText Ciudad =findViewById(R.id.txtciudad);
        EditText Correo =findViewById(R.id.txtcorreo);
        EditText Celular =findViewById(R.id.txtpolefono);
        RadioButton Masculino =findViewById(R.id.radioButton3);
        RadioButton Femenino =findViewById(R.id.radioButton6);
        Nombre.setText("");
        Cedula.setText("");
        FechaDeNacimiento.setText("");
        Ciudad.setText("");
        Correo.setText("");
        Celular.setText("");
        Masculino.setChecked(false);
        Femenino.setChecked(false);
    }
    public void btguardar (View view)
    {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        EditText nombre=findViewById(R.id.txtnombres);
        EditText cedula=findViewById(R.id.textcedula);
        EditText FechNa=findViewById(R.id.calendario);
        EditText ciudad=findViewById(R.id.txtciudad);
        EditText correo=findViewById(R.id.txtcorreo);
        EditText celular=findViewById(R.id.txtpolefono);
        RadioButton fem=findViewById(R.id.radioButton6);
        RadioButton mas=findViewById(R.id.radioButton3);
        String genero;

        if (mas.isChecked())
            genero="Masculino";
        else genero="Femenino";

        Bundle b=new Bundle();
        b.putString("NOMBRES", nombre.getText().toString());
        b.putString("CEDULA", cedula.getText().toString().toUpperCase());
        b.putString("FECHA", FechNa.getText().toString());
        b.putString("CIUDAD", ciudad.getText().toString().toUpperCase());
        b.putString("GENERO", genero.toString());
        b.putString("CORREO", correo.getText().toString());
        b.putString("CELULAR", celular.getText().toString());
        intent.putExtras(b);

        startActivity(intent);
    }
}