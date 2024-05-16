package FinalLibre2023;

import FinalLibre2023.Filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Entrenamiento implements Comparable<Entrenamiento> {
    private String nombre;
    private int intensidad;

    public Entrenamiento(String nombre, int intensidad) {
        this.nombre = nombre;
        this.intensidad = intensidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIntensidad() {
        return intensidad;
    }
    public abstract int getDuracion();
    public abstract int getCosto_energetico();
    public abstract String getActividad();
    public abstract ArrayList<Entrenamiento> cumple(Filtro filtro);

    public void ejecutar(){
        System.out.println("ejercitando");
    }
    public int compareTo(Entrenamiento otro){
        return this.getIntensidad()-otro.getIntensidad();
    }
}
