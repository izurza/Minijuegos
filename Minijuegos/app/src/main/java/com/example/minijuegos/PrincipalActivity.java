package com.example.minijuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    protected Button jugar;
    protected Button creditos;
    protected Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        jugar = (Button) findViewById(R.id.boton_jugar_principal);
        creditos = (Button) findViewById(R.id.boton_creditos_principal);
        salir = (Button) findViewById(R.id.boton_salir_principal);

        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pasarPantalla(new Intent(PrincipalActivity.this, MinijuegosActivity.class));
            }
        });

        creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pasarPantalla(new Intent(PrincipalActivity.this, CreditosActivity.class));
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });


    }

    public void pasarPantalla(Intent intent){
        finish();
        startActivity(intent);
    }

}