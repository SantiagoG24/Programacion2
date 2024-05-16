package FinalLibre2024V2.Filtros;

import FinalLibre2024V2.Elemento;

public class FiltroOr extends Filtro {
    Filtro f1;
    Filtro f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return f1.cumple(elemento) || f2.cumple(elemento);
    }
}
