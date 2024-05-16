package FinalLibre2024V2.Filtros;

import FinalLibre2024V2.Elemento;

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
