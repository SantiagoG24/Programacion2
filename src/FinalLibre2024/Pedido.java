package FinalLibre2024;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Elemento> comanda;
    private int mesa;
    private String mozo;

    public Pedido(int mesa, String mozo) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.comanda =new ArrayList<>();
    }

    public ArrayList<Elemento> getComanda() {
        ArrayList<Elemento> salida= new ArrayList<>();
        for (Elemento  elemento:comanda){
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
}
