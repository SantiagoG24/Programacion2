package FinalLibre2024.Filtros;

import FinalLibre2024.Elemento;
import FinalLibre2024.Filtros.Filtro;

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
