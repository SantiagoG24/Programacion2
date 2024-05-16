package FinalLibre2024V2;

import FinalLibre2024V2.Filtros.Filtro;

import java.util.ArrayList;

public abstract class Elemento {
    private String nombre;
    private String tipo;
    private String modo_preparacion;

    public Elemento(String nombre, String tipo, String modo_preparacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modo_preparacion = modo_preparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModo_preparacion() {
        return modo_preparacion;
    }
    public abstract  int getCalorias();
    public abstract int getTiempo();
    public abstract float getPrecio();
    public abstract ArrayList<Elemento> cumple(Filtro filtro);
}
