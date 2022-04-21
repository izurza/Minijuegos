package com.example.minijuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MinijuegosActivity extends AppCompatActivity {

    protected Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minijuegos);


        atras = (Button) findViewById(R.id.boton_atras_minijuegos);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pasarPantalla(new Intent(MinijuegosActivity.this, PrincipalActivity.class));
            }
        });
    }

    public void pasarPantalla(Intent intent){
        finish();
        startActivity(intent);
    }
}