package Practico10.Ej6;

import java.util.ArrayList;
import java.util.Date;

public class Habitacion {
    private ArrayList<String> comodidades;
    private int metrosCuadrados;
    private int camas;
    private Date ultimaOcupacion;
    private Boolean aceptaMascotas;

    public Habitacion(int metrosCuadrados, int camas, Date ultimaOcupacion, Boolean aceptaMascotas) {
        comodidades= new ArrayList<>();
        this.metrosCuadrados = metrosCuadrados;
        this.camas = camas;
        this.ultimaOcupacion = ultimaOcupacion;
        this.aceptaMascotas = aceptaMascotas;
    }
    public void addComodidades(String nueva){
        if (!comodidades.contains(nueva)){
            comodidades.add(nueva);
        }
    }
    public boolean estaLibre(){
        return ultimaOcupacion.before(new Date());
    }

    public ArrayList<String> getComodidades() {
        return new ArrayList<>(comodidades);
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public int getCamas() {
        return camas;
    }
    public boolean comodidadesContains(String nueva){
        return  getComodidades().contains(nueva);
    }

    public Date getUltimaOcupacion() {
        return ultimaOcupacion;
    }

    public Boolean getAceptaMascotas() {
        return aceptaMascotas;
    }
}
