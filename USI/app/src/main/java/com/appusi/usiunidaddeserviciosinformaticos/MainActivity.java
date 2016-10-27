package com.appusi.usiunidaddeserviciosinformaticos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private TextView txt_fecha_hoy_date;
    private RadioButton rdButton_salas;
    private RadioButton rdButton_monitorias;
    private Button btnConsultar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_fecha_hoy_date = (TextView) findViewById(R.id.txt_fecha_hoy_date);
        rdButton_salas = (RadioButton) findViewById(R.id.rdButton_salas);
        rdButton_monitorias = (RadioButton) findViewById(R.id.rdButton_monitorias);
        btnConsultar = (Button) findViewById(R.id.btnConsultar);


        rdButton_salas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdButton_monitorias.isChecked()){
                    rdButton_monitorias.setChecked(false);
                }
            }
        });
        rdButton_monitorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdButton_salas.isChecked()){
                    rdButton_salas.setChecked(false);
                }
            }
        });

        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Proximamente, DIOS LO BENDIGA MR BRAYAN ", Toast.LENGTH_SHORT).show();
            }
        });


        Date fechaActual = new Date();


        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
        String fecha = "" + dateFormat.format(fechaActual);
        txt_fecha_hoy_date.setText(fecha);
    }
}