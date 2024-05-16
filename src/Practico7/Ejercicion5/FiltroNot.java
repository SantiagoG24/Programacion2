package Practico7.Ejercicion5;

public class FiltroNot extends Filtro{
    private Filtro filtro;

    public FiltroNot(Filtro filtro) {
        this.filtro = filtro;
    }
    public boolean cumple(Pelicula pelicula){
        return !filtro.cumple(pelicula);
    }
}
