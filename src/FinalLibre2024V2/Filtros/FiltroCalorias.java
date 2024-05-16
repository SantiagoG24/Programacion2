package FinalLibre2024V2.Filtros;

import FinalLibre2024V2.Elemento;

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
