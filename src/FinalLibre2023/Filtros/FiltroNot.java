package FinalLibre2023.Filtros;

import FinalLibre2023.Entrenamiento;
import FinalLibre2023.Filtros.Filtro;

public class FiltroNot extends Filtro {
    private Filtro f1;

    public FiltroNot(Filtro f1) {
        this.f1 = f1;
    }
    public boolean cumple(Entrenamiento entrenamiento){
        return !f1.cumple(entrenamiento);
    }
}
