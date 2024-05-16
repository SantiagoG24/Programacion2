package Practico10.Ej2;
import java.util.ArrayList;
public class CalculadorPorcentaje {
    public double calcular(ArrayList<Double> sensores) {
        double total=0;
        for (Double valor : sensores){
            total+=valor;
        }
        return total/100;
    }
}

