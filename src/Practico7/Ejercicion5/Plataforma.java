package Practico7.Ejercicion5;

import java.util.ArrayList;

public class Plataforma {
    private Filtro filtro;
    ArrayList<Pelicula> catalogo;

    public Plataforma(Filtro filtro) {
        this.filtro= filtro;
        this.catalogo = new ArrayList<>();
    }

    public Filtro getFiltro() {
        return filtro;
    }

    public void setFiltro(Filtro filtro) {
        this.filtro = filtro;
    }

    public ArrayList<Pelicula> buscar(Filtro filtro){
        ArrayList<Pelicula> salida = new ArrayList<>();
        for (Pelicula pelicula :catalogo){
            if(filtro.cumple(pelicula))
                salida.add(pelicula);

        }
        return salida;
    }
    public void  addPelicula(Pelicula nueva){
        if (nueva.esExitosa(filtro))
            catalogo.add(nueva);
    }
}
