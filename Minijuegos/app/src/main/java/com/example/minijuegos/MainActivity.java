package com.example.minijuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Definir actividad dependiente de tiempo
        TimerTask myTimerTask = new TimerTask() {
            @Override
            public void run() {
                pasarPantalla(new Intent(MainActivity.this, PrincipalActivity.class));
            }
        };

        //Establecer el tiempo en el que se realiza la actividad
        Timer timer = new Timer();
        timer.schedule(myTimerTask, 3000);

    }

    public void pasarPantalla(Intent intent){
        finish();
        startActivity(intent);

    }
}