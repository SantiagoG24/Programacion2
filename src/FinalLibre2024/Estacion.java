package FinalLibre2024;

import FinalLibre2024.Filtros.Filtro;

import java.util.ArrayList;

public class Estacion {
    private Filtro especialidad;
    private ArrayList<Elemento> cola;

    public Estacion(Filtro especialidad) {
        this.especialidad = especialidad;
        cola=new ArrayList<>();
    }
    public  boolean puedoPreparar(Elemento elemento){
        return especialidad.cumple(elemento);
    }
    public void addCola(Elemento  nuevo){
        if (puedoPreparar(nuevo)) {
            cola.add(nuevo);
        }
    }
}
