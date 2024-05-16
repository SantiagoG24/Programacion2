package FinalLibre2024;

import FinalLibre2024.Filtros.Filtro;

import java.util.ArrayList;

public class Pasteleria {
    ArrayList<Estacion> cocina;
    ArrayList<Elemento> carta;
    Filtro crtiterio;


    public Pasteleria(ArrayList<Estacion> cocina, Filtro crtiterio, double costo_cumple, double costo_noCumple) {
        this.cocina = cocina;
        this.crtiterio = crtiterio;
        this.carta= new ArrayList<>();

    }

    public ArrayList<Estacion> getCocina() {
        return cocina;
    }
    public void addCarta(Elemento nuevo){
        if (!carta.contains(nuevo)){
            carta.add(nuevo);
        }
    }

    public Filtro getCrtiterio() {
        return crtiterio;
    }



    public void setCrtiterio(Filtro crtiterio) {
        this.crtiterio = crtiterio;
    }

    public double getPrecio(Pedido nuevo){
        double total=0;
        for (Elemento elemento :nuevo.getComanda()){
            total+= elemento.getPrecio();
        }
        return total;
    }
    public void prepararComanda(Pedido nuevo){
        for(Elemento elemento:nuevo.getComanda()){
            asignarEstacion(elemento);
        }
    }
    public void asignarEstacion(Elemento elemento){
        boolean valor=false;
        for (Estacion estacion :cocina){
            if (estacion.puedoPreparar(elemento) && !valor) {
                valor=!valor;
                estacion.addCola(elemento);
                break;
            }
        }
    }
    public ArrayList<Elemento> buscar(Filtro filtro){
        ArrayList<Elemento> salida= new ArrayList<>();
        for (Elemento  elemento:carta){
            salida.addAll(elemento.cumple(filtro));
        }
        return salida;
    }
}
