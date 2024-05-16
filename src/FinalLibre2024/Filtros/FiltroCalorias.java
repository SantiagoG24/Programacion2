package FinalLibre2024.Filtros;

import FinalLibre2024.Elemento;
import FinalLibre2024.Filtros.Filtro;

public class FiltroCalorias extends Filtro {
    private int caloriasMax;

    public FiltroCalorias(int caloriasMax) {
        this.caloriasMax = caloriasMax;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getCalorias() < caloriasMax;
    }
}
