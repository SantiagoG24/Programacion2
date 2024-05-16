package FinalLibre2024V2.Filtros;

import FinalLibre2024V2.Elemento;

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
