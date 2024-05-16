package FinalLibre2023;

import FinalLibre2023.Filtros.Filtro;

import java.util.ArrayList;

public class EntrenamientoCumpuesto extends Entrenamiento{
    private ArrayList<Entrenamiento>  entrenamientos;
    private int factor;

    public EntrenamientoCumpuesto(String nombre, int intensidad, int factor) {
        super(nombre, intensidad);
        this.factor = factor;
        entrenamientos= new ArrayList<>();
    }

    public int getDuracion() {
        int duracion=0;
        for (Entrenamiento entrenamiento: entrenamientos){
            duracion+= entrenamiento.getDuracion();
        }
        return duracion;
    }
    public int getCosto_energetico() {
        int costo=0;
        for (Entrenamiento entrenamiento : entrenamientos){
            costo+=entrenamiento.getCosto_energetico();
        }
        return costo*factor;
    }
    public String getActividad() {
        String actividad="";
        for (Entrenamiento entrenamiento : entrenamientos){
            actividad+=entrenamiento.getActividad() +"-";
        }
        return actividad;
    }
    public ArrayList<Entrenamiento> cumple(Filtro filtro){
        ArrayList<Entrenamiento> salida= new ArrayList<>();
        if (filtro.cumple(this)){
            salida.add(this);
        }else {
            for (Entrenamiento entrenamiento : entrenamientos) {
                if (filtro.cumple(entrenamiento))
                    salida.add(entrenamiento);
            }
        }
        return salida;
    }
    public int compareTo(Entrenamiento otro){return this.getIntensidad()-otro.getIntensidad();}

}
