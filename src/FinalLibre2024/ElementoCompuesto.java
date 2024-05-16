package FinalLibre2024;

import FinalLibre2024.Filtros.Filtro;

import java.util.ArrayList;

public class ElementoCompuesto extends Elemento{
    private ArrayList<Elemento> recetas;

    public ElementoCompuesto(String nombre, String tipo, String modo_preparacion) {
        super(nombre, tipo, modo_preparacion);
        this.recetas = new ArrayList<>();
    }

    @Override
    public int getCalorias() {
        int total=0;
        for (Elemento elemento :recetas){
            total+=elemento.getCalorias();
        }
        return total;
    }

    @Override
    public int getTiempo() {
        int total=0;
        for (Elemento elemento : recetas){
            total+= elemento.getTiempo();
        }
        return total;
    }
    @Override
    public double getPrecio() {
        float total=0;
        for (Elemento elemento :recetas){
            total+= elemento.getPrecio();
        }
        return total;
    }

    @Override
    public ArrayList<Elemento> cumple(Filtro filtro) {
        ArrayList<Elemento> salida=new ArrayList<>();
        if (filtro.cumple(this)){
            salida.add(this);
        }else {
            for (Elemento elemento :recetas){
                if (filtro.cumple(elemento)){
                    salida.add(elemento);

                }
            }
        }
        return salida;
    }
}
