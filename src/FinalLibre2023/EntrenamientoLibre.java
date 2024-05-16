package FinalLibre2023;

import FinalLibre2023.Filtros.Filtro;

import java.util.ArrayList;

public class EntrenamientoLibre extends Entrenamiento{
    private int duracion;
    private int costo_energetico;
    private String actividad;
    public EntrenamientoLibre(String nombre,int intensidad,int duracion, int costo_energetico, String actividad) {
        super(nombre,intensidad);
        this.duracion = duracion;
        this.costo_energetico = costo_energetico;
        this.actividad = actividad;
    }
    public int getDuracion() {
        return duracion;
    }
    public int getCosto_energetico() {
        return costo_energetico;
    }
    public String getActividad() {
        return actividad;
    }
    public ArrayList<Entrenamiento> cumple(Filtro filtro){
        ArrayList<Entrenamiento> salida= new ArrayList<>();
        if (filtro.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
    //public int compareTo(Entrenamiento otro){return this.getIntensidad()-otro.getIntensidad();}
    //public int compareTo(Entrenamiento otro){return this.getDuracion()-otro.getDuracion();}
    //public int compareTo(Entrenamiento otro){return this.getCosto_energetico()- otro.getCosto_energetico();}

}
