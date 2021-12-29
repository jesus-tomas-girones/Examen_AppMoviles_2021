package com.example.jtomas.examen_a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 5 b) COLECCIONES
public class Registro {
    private long segundos;
    private String habitacion;
    private boolean encendida;

    public Registro(long segundos, String habitacion, boolean encendida) {
        this.segundos = segundos;
        this.habitacion = habitacion;
        this.encendida = encendida;
    }

    public long getSegundos() {
        return segundos;
    }

    public void setSegundos(long segundos) {
        this.segundos = segundos;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "segundos=" + segundos +
                ", habitacion='" + habitacion + '\'' +
                ", encendida=" + encendida +
                '}';
    }

    static Map<Integer,Registro> creaMapa(long[] segundos, String[] habitacion, boolean[] encendida) {
        Map<Integer,Registro> mapa = new HashMap<>();
        for (int n = 0; n<segundos.length; n++) {
            mapa.put(n+1,new Registro(segundos[n],habitacion[n],encendida[n]));
        }
        return mapa;
    }

    // 5 c) COLECCIONES
    List<Registro> creaLista(long[] segundos, String[] habitacion, boolean[] encendida) {
        List<Registro> lista = new ArrayList<>();
        for (int n = 0; n<segundos.length; n++) {
            lista.add(new Registro(segundos[n],habitacion[n],encendida[n]));
        }
        return lista;
    }
}