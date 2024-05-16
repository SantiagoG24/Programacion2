package FinalLibre2024V2.Filtros;

import FinalLibre2024V2.Elemento;

public class FiltroTiempo extends Filtro {
    private int tiempoMax;

    public FiltroTiempo(int tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getTiempo() < tiempoMax;
    }
}
