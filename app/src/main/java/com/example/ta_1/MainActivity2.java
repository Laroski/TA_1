package com.example.ta_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtinfo = (TextView)findViewById(R.id.txtmostrar);
        Bundle bundle = this.getIntent().getExtras();
        txtinfo.setText("Nombre: "+ bundle.getString("NOMBRE") + "\n" + "\n" +
                "Cedula: "+ bundle.getString("CEDULA") + "\n" + "\n" +
                "Fecha: "+ bundle.getString("FECHA") + "\n" + "\n" +
                "Ciudad: "+ bundle.getString("CIUDAD") + "\n" + "\n" +
                        "Genero: "+ bundle.getString("GENERO") + "\n" + "\n" +
                        "Correo: "+ bundle.getString("CORREO") + "\n" + "\n" +
                        "Telefono: "+ bundle.getString("CELULAR"));
    }
}