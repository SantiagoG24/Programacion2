package FinalLibre2024V2.Filtros;

import FinalLibre2024V2.Elemento;

public class FiltroNot extends Filtro {
    Filtro f1;

    public FiltroNot(Filtro f1) {
        this.f1 = f1;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return !f1.cumple(elemento);
    }
}
