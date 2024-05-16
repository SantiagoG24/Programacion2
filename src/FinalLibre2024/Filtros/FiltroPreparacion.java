package FinalLibre2024.Filtros;

import FinalLibre2024.Elemento;
import FinalLibre2024.Filtros.Filtro;

public class FiltroPreparacion extends Filtro {
    private String preparacion;

    public FiltroPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getModo_preparacion().equals(preparacion);
    }
}
