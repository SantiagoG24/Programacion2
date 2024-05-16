package FinalLibre2024.Filtros;

import FinalLibre2024.Elemento;
import FinalLibre2024.Filtros.Filtro;

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
