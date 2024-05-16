package FinalLibre2024V2;

import FinalLibre2024V2.Filtros.Filtro;

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
    public void addCola(Elemento nuevo){
        cola.add(nuevo);
    }
}
