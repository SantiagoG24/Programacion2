package FinalLibre2024;

import FinalLibre2024.Calcularores.Calculador;
import FinalLibre2024.Filtros.Filtro;

import java.util.ArrayList;

public class ElementoSimple extends Elemento{
    private int calorias;
    private int tiempo;
    private double precio;
    static Calculador calculador;

    public ElementoSimple(String nombre, String tipo, String modo_preparacion, int calorias, int tiempo, double precio,Calculador cal) {
        super(nombre, tipo, modo_preparacion);
        this.calorias = calorias;
        this.tiempo = tiempo;
        this.precio = precio;
        this.calculador= cal;
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
    public double getPrecio() {
        return calculador.calcularPrecio(this);
    }
    public ArrayList<Elemento> cumple(Filtro filtro){
        ArrayList<Elemento> salida=new ArrayList<>();
        if (filtro.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
}
