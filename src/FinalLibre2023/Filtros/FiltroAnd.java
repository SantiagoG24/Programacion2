package FinalLibre2023.Filtros;

import FinalLibre2023.Entrenamiento;
import FinalLibre2023.Filtros.Filtro;

public class FiltroAnd extends Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    public boolean cumple(Entrenamiento entrenamiento){
        return f1.cumple(entrenamiento) && f2.cumple(entrenamiento);
    }
}
