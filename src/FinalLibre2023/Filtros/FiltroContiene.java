package FinalLibre2023.Filtros;

import FinalLibre2023.Entrenamiento;
import FinalLibre2023.Filtros.Filtro;

public class FiltroContiene extends Filtro {
    private String palabra;

    public FiltroContiene(String palabra) {
        this.palabra = palabra;
    }
    public boolean cumple(Entrenamiento entrenamiento){
        return entrenamiento.getActividad().contains(palabra);
    }
}
