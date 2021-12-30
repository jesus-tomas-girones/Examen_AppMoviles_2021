package com.example.jtomas.examen_a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.jtomas.examen_a.databinding.ElementoListaBinding;

import java.util.Map;

//7 y 8.-RecyclerView
public class Adaptador extends
        RecyclerView.Adapter<Adaptador.ViewHolder> {

    protected Map<Integer,Registro> registros;    // Lista de lugares a mostrar

    public Adaptador(Map<Integer,Registro> registros) {
        this.registros = registros;
    }

    //Creamos nuestro ViewHolder, con los tipos de elementos a modificar
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView habitacion, segundos, encendido;
        public ImageView foto;

        public ViewHolder(ElementoListaBinding itemView) {
            super(itemView.getRoot());
            habitacion = itemView.habitacion;
            segundos = itemView.segundos;
            foto = itemView.foto;
            encendido= itemView.encendido;
        }

        // Personalizamos un ViewHolder a partir de un lugar
        public void personaliza(Registro registro) {
            habitacion.setText(registro.getHabitacion());
            segundos.setText(""+registro.getSegundos());
            encendido.setText(""+registro.isEncendida());
            if (registro.getHabitacion().equals("baño")){
                foto.setImageResource(R.drawable.bano);
            } else {
                foto.setImageResource(R.drawable.sala);
            }
            foto.setScaleType(ImageView.ScaleType.FIT_END);
        }
    }

    // Creamos el ViewHolder con la vista de un elemento sin personalizar
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflamos la vista desde el xml
        ElementoListaBinding v = ElementoListaBinding.inflate(LayoutInflater
                .from(parent.getContext()), parent, false);
        return new Adaptador.ViewHolder(v);
    }

    // Usando como base el ViewHolder y lo personalizamos
    @Override
    public void onBindViewHolder(ViewHolder holder, int posicion) {
        Registro registro = registros.get(posicion+1);
        holder.personaliza(registro);
    }

    // Indicamos el número de elementos de la lista
    @Override public int getItemCount() {
        return registros.size();
    }
}