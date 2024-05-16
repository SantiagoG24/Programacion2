package Practico7.Ejercicion5;

public class FiltroContieneTitulo extends Filtro{
    private String buscada;

    public FiltroContieneTitulo(String buscada) {
        this.buscada = buscada;
    }
    public boolean cumple(Pelicula nueva){
        return nueva.getTitulo().contains(buscada);
    }
}
