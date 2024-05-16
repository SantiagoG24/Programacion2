package Practico10.Ej2;

import java.util.ArrayList;

public class CalculadorMayor extends Calculador{
    @Override
    public double calcular(ArrayList<Double> sensores) {
        double mayor=0;
        for (Double sensor :sensores){
            if (sensor>mayor){
                mayor=sensor;
            }
        }
        return mayor;
    }
}
