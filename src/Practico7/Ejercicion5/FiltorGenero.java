package Practico7.Ejercicion5;

public class FiltorGenero extends Filtro{
    private String busqueda;

    public FiltorGenero(String busqueda) {
        this.busqueda = busqueda;
    }
    public boolean cumple(Pelicula pelicula){
        return pelicula.getGenero().contains(busqueda);
    }

}
