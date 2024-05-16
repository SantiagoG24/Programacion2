package FinalLibre2023.Filtros;

import FinalLibre2023.Entrenamiento;
import FinalLibre2023.Filtros.Filtro;

public class FiltroGastoEnergetico extends Filtro {
    private int gasto_maximo;

    public FiltroGastoEnergetico(int gasto_maximo) {
        this.gasto_maximo = gasto_maximo;
    }
    public boolean cumple(Entrenamiento entrenamiento){
        return entrenamiento.getCosto_energetico()<gasto_maximo;
    }
}
