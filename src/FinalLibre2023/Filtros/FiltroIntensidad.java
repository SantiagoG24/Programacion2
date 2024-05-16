package FinalLibre2023.Filtros;

import FinalLibre2023.Entrenamiento;
import FinalLibre2023.Filtros.Filtro;

public class FiltroIntensidad extends Filtro {
    public int intensidad_maxima;

    public FiltroIntensidad(int intensidad_maxima) {
        this.intensidad_maxima = intensidad_maxima;
    }
    public boolean cumple(Entrenamiento entrenamiento){
        return entrenamiento.getIntensidad()<intensidad_maxima;
    }
}
