package Practico10.Ej2;

import java.util.ArrayList;

public class FiltroViento extends Filtro{
    private double vientoMax;
    private Calculador calculador;

    public FiltroViento(double vientoMax, Calculador calculador) {
        this.vientoMax = vientoMax;
        this.calculador = calculador;
    }

    @Override
    public boolean cumple(ArrayList<SensorData> registros) {
        ArrayList<Double> datos= new ArrayList<>();
        for (SensorData registro :registros){
            datos.add(registro.getViento());
        }
        double total= calculador.calcular(datos);
        return total<vientoMax;
    }
}
