package Practico7.Ejercicion5;

public class FiltroOr extends Filtro{
    private Filtro f1;
    private Filtro f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    public boolean cumple(Pelicula pelicula){
        return f1.cumple(pelicula) || f2.cumple(pelicula);
    }
}
