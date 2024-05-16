package FinalLibre2024V2;

import FinalLibre2024V2.Filtros.Filtro;

import java.util.ArrayList;

public class ElementoSimple extends Elemento {
    private int calorias;
    private int tiempo;
    private float precio;

    public ElementoSimple(String nombre, String tipo, String modo_preparacion, int calorias, int tiempo, float precio) {
        super(nombre, tipo, modo_preparacion);
        this.calorias = calorias;
        this.tiempo = tiempo;
        this.precio = precio;
    }

    @Override
    public int getCalorias() {
        return calorias;
    }

    @Override
    public int getTiempo() {
        return tiempo;
    }

    @Override
    public float getPrecio() {
        return precio;
    }
    public ArrayList<Elemento> cumple(Filtro filtro){
        ArrayList<Elemento> salida=new ArrayList<>();
        if (filtro.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
}
