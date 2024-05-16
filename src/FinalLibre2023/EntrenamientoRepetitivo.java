package FinalLibre2023;

import FinalLibre2023.Filtros.Filtro;

import java.util.ArrayList;

public class EntrenamientoRepetitivo extends Entrenamiento{
    private  Entrenamiento referencia;
    private int repeticiones;
    private  int pausa;

    public EntrenamientoRepetitivo(String nombre, int intensidad, Entrenamiento referencia, int repeticiones) {
        super(nombre, intensidad);
        this.referencia = referencia;
        this.repeticiones = repeticiones;
        this.pausa=1;
    }
    public EntrenamientoRepetitivo(String nombre, int intensidad, Entrenamiento referencia, int repeticiones,int pasusa) {
        super(nombre, intensidad);
        this.referencia = referencia;
        this.repeticiones = repeticiones;
        this.pausa=pasusa;
    }

    public void setPausa(int pausa) {
        this.pausa = pausa;
    }

    public int getDuracion() {
        int duracion= referencia.getDuracion();
        duracion= duracion* repeticiones;
        return duracion+pausa;
    }
    public int getCosto_energetico() {
        int costo= referencia.getCosto_energetico();
        costo= costo * repeticiones;
        return costo+pausa;}
    public String getActividad() {
        String mensaje= referencia.getActividad() +" X"+ repeticiones;
        return mensaje;
    }
    public ArrayList<Entrenamiento> cumple(Filtro filtro){
        ArrayList<Entrenamiento> salida= new ArrayList<>();
        salida.addAll(referencia.cumple(filtro));
        return salida;
    }
    public int compareTo(Entrenamiento otro){
        return this.getIntensidad()-otro.getIntensidad();
    }
}
