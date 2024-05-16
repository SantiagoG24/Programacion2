package FinalLibre2024.Calcularores;

import FinalLibre2024.Filtros.Filtro;
import FinalLibre2024.Elemento;

public class CalculadorCriterio extends Calculador {
    Calculador c1;
    Calculador c2;
    Filtro criterio;

    public CalculadorCriterio(Calculador c1, Calculador c2, Filtro criterio) {
        this.c1 = c1;
        this.c2 = c2;
        this.criterio = criterio;
    }
    @Override
    public double calcularPrecio(Elemento e) {
        if(criterio.cumple(e)){
            return c1.calcularPrecio(e);
        }else {
            return c2.calcularPrecio(e);
        }
    }
}
