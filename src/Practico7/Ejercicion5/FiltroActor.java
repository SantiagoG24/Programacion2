package Practico7.Ejercicion5;

public class FiltroActor extends Filtro{
    private String actor_buscado;

    public FiltroActor(String actor_buscado) {
        this.actor_buscado = actor_buscado;
    }
    public boolean cumple(Pelicula pelicula){
        return pelicula.getActores().contains(actor_buscado);
    }
}
