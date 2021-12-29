package com.example.jtomas.examen_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    // 5 a) Colecciones
    static long    SEGUNDOS[]=  { 1000L, 4000L, 5000L, 6000L, 9000L,12000L,14000L,16000L};
    static String  HABITACION[]={"sala","baño","baño","baño","sala","baño","sala","sala"};
    static boolean ENCENDIDA[]= {  true,  true, false,  true, false, false,  true, false};

    // 4.-Guardar estado
    String textoBoton;
    Button buttonIgu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3.-Propiedades vistas
        buttonIgu = findViewById(R.id.button_igu);
        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonIgu.getText().length()<10) {
                    textoBoton = buttonIgu.getText() + "1";
                    buttonIgu.setText(textoBoton);
                }
            }
        });

        // 5 c) Colecciones
        Map<Integer,Registro> mapa = Registro.creaMapa(SEGUNDOS,HABITACION,ENCENDIDA);
        Log.d("xEXAMEN", mapa.toString());

        // 6.-Algoritmo
        Set<String> habitaciones = new HashSet<>();   // Creaomos conjunto que contenga
        for (int n = 0; n<HABITACION.length; n++) {   // todas las habitaciones distintas
            habitaciones.add(HABITACION[n]);
        }
        for (String habitacion:habitaciones){          // Para cada habitación
            long totalHabitacion = 0;                    // Para esta habitación inicializamos tiempo
            long tiempoAnterior = 0;
            for (int n = 0; n<HABITACION.length; n++) { // Para cada registro
                if(habitacion.equals(HABITACION[n])){   // Si el registro es de la habitación actual
                    if (ENCENDIDA[n]) {                 // Si se enciende la luz
                        tiempoAnterior = SEGUNDOS[n];   // Nos acordamos de cuando se encendió
                    } else {                            // Si se apaga la luz
                        long tiempoEncendida = SEGUNDOS[n]-tiempoAnterior; //Calculamos tiempo encendida
                        totalHabitacion += tiempoEncendida;  //Lo acumulamos al total
                    }
                }
            }
            Log.d("xxEXAMEN", "Habitación "+habitacion+ " encendida "+totalHabitacion+" segundos");
        }
    }

    //4.-Guardar estado
    @Override protected void onSaveInstanceState(Bundle guardarEstado) {
        super.onSaveInstanceState(guardarEstado);
        guardarEstado.putString("textoBoton", textoBoton);
    }

    @Override protected void onRestoreInstanceState(Bundle recEstado) {
        super.onRestoreInstanceState(recEstado);
        textoBoton = recEstado.getString("textoBoton");
        buttonIgu.setText(textoBoton);
    }

}