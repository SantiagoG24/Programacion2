package Practico7.Ejercicion5;

public class FiltroDuracion extends Filtro{
    private double duracionMaxima;

    public FiltroDuracion(double duracionMaxima) {
        this.duracionMaxima = duracionMaxima;
    }
    public boolean cumple(Pelicula pelicula){
        return pelicula.getDuracion() < duracionMaxima;
    }
}
