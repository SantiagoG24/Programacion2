package FinalLibre2023.Filtros;

import FinalLibre2023.Entrenamiento;
import FinalLibre2023.Filtros.Filtro;

public class FiltroDuracion extends Filtro {
    private int duracion_minima;

    public FiltroDuracion(int duracion_minima) {
        this.duracion_minima = duracion_minima;
    }
    public boolean cumple (Entrenamiento entrenamiento){
        return entrenamiento.getDuracion() > duracion_minima;
    }
}
