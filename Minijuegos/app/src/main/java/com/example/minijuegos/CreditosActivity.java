package com.example.minijuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreditosActivity extends AppCompatActivity {


    protected Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        atras = (Button) findViewById(R.id.boton_atras_creditos);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pasarPantalla(new Intent(CreditosActivity.this, PrincipalActivity.class));
            }
        });
    }

    public void pasarPantalla(Intent intent){
        finish();
        startActivity(intent);
    }
}