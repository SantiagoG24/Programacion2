package Practico7.Ejercicion5;

public class FiltroDirector extends Filtro{
    private String director_buscado;

    public FiltroDirector(String director_buscado) {
        this.director_buscado = director_buscado;
    }
    public boolean cumple(Pelicula nueva){
        return nueva.getDirector().equals(director_buscado);
    }
}
