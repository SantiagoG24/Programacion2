package FinalLibre2024V2;

import FinalLibre2024V2.Filtros.Filtro;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Elemento> comanda;
    private int mesa;
    private String mozo;
    private static double costo_cumple;
    private static double costo_noCumple;
    private static Filtro crtiterio;

    public Pedido(int mesa, String mozo) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.comanda =new ArrayList<>();
    }

    public static void setCosto_cumple(double costo_cumple) {
        Pedido.costo_cumple = costo_cumple;
    }

    public static void setCosto_noCumple(double costo_noCumple) {
        Pedido.costo_noCumple = costo_noCumple;
    }

    public static void setCrtiterio(Filtro crtiterio) {
        Pedido.crtiterio = crtiterio;
    }

    public ArrayList<Elemento> getComanda() {
        ArrayList<Elemento> salida= new ArrayList<>();
        for (Elemento elemento:comanda){
            salida.add(elemento);
        }
        return salida;
    }

    public int getMesa() {
        return mesa;
    }

    public String getMozo() {
        return mozo;
    }
    public double getPrecio(){
        double total=0;
        for (Elemento elemento :getComanda()){
            total+= elemento.getPrecio();
            if (crtiterio.cumple(elemento)){
                total+=Pedido.costo_cumple;
            }else {
                total+=Pedido.costo_noCumple;
            }
        }
        return total;
    }


}
