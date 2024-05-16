package FinalLibre2024V2;

import FinalLibre2024V2.Filtros.Filtro;

import java.util.ArrayList;

public class Cocina {
    ArrayList<Estacion> estaciones;
    ArrayList<Elemento> carta;
    ArrayList<Pedido> pedidos;

    public Cocina(Filtro crtiterio, double costo_cumple, double costo_noCumple) {
        this.pedidos =new ArrayList<>();
        this.estaciones = new ArrayList<>();
        this.carta= new ArrayList<>();
        setearCostoCumple(costo_cumple);
        setearCostoNoCumple(costo_noCumple);
        setCrtiterio(crtiterio);
    }

    public ArrayList<Estacion> getEstaciones() {
        return new ArrayList<>(estaciones);
    }
    public void addCarta(Elemento nuevo){
        if (!carta.contains(nuevo)){
            carta.add(nuevo);
        }
    }
    public void setearCostoCumple(double nuevo){
        Pedido.setCosto_cumple(nuevo);
    }
    public void setearCostoNoCumple(double nuevo){
        Pedido.setCosto_noCumple(nuevo);
    }
    public  void setCrtiterio(Filtro crtiterio) {
        Pedido.setCrtiterio(crtiterio);
    }

    public void agregarPedido(Pedido nuevo){
        pedidos.add(nuevo);
    }
    public double getCostoPedido(Pedido nuevo){
        return nuevo.getPrecio();
    }
    public void prepararComanda(Pedido nuevo){
        for(Elemento elemento:pedidos.getFirst().getComanda()){
            asignarEstacion(elemento);
        }
    }
    public void asignarEstacion(Elemento elemento){
        for (Estacion estacion :getEstaciones()){
            if (estacion.puedoPreparar(elemento) ) {
                estacion.addCola(elemento);
                //break;
            }
        }
    }
    public ArrayList<Elemento> buscar(Filtro filtro){
        ArrayList<Elemento> salida= new ArrayList<>();
        for (Elemento elemento:carta){
            salida.addAll(elemento.cumple(filtro));
        }
        return salida;
    }

}
