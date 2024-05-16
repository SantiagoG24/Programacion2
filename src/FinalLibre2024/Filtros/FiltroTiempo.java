package FinalLibre2024.Filtros;

import FinalLibre2024.Elemento;
import FinalLibre2024.Filtros.Filtro;

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
