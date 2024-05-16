package FinalLibre2024.Calcularores;

import FinalLibre2024.Elemento;

public class CalculadorCompuesto extends Calculador{
    Calculador c1,c2;

    public CalculadorCompuesto(double costo_cumple, double costo_noCumple, Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcularPrecio(Elemento e) {
        return c1.calcularPrecio(e) + c2.calcularPrecio(e);
    }
}
