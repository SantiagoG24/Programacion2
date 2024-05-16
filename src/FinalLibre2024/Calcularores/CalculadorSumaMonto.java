package FinalLibre2024.Calcularores;

import FinalLibre2024.Elemento;

public class CalculadorSumaMonto extends Calculador{
    private double monto;

    public CalculadorSumaMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public double calcularPrecio(Elemento e) {
        return e.getPrecio()+ monto;
    }
}
