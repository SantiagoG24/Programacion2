package FinalLibre2024.Filtros;

import FinalLibre2024.Elemento;
import FinalLibre2024.Filtros.Filtro;

public class FiltroTipo extends Filtro {
    private String tipo;

    public FiltroTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getTipo().equals(tipo);
    }
}
