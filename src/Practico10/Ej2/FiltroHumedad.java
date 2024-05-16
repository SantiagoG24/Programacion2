package Practico10.Ej2;

import java.util.ArrayList;

public class FiltroHumedad extends Filtro{
    private double humedadMax;
    private Calculador calculador;

    public FiltroHumedad(double humedadMax,Calculador calculador) {
        this.humedadMax = humedadMax;
        this.calculador=calculador;
    }

    @Override
    public boolean cumple(ArrayList<SensorData> registros) {
        ArrayList<Double> datos= new ArrayList<>();
        for (SensorData registro:registros){
            datos.add(registro.getHumedad());
        }
        double total=calculador.calcular(datos);
        return total<humedadMax;
    }
}
