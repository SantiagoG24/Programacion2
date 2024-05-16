package FinalLibre2024.Calcularores;

import FinalLibre2024.Elemento;

public class CalculadorPorcentaje extends Calculador{
    private double porcentaje;

    public CalculadorPorcentaje(double costo_cumple, double costo_noCumple, double porcentaje) {

        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularPrecio(Elemento e) {
        return e.getPrecio()+(e.getPrecio()*porcentaje);
    }
}
