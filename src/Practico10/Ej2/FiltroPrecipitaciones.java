package Practico10.Ej2;

import java.util.ArrayList;

public class FiltroPrecipitaciones extends Filtro{
    private double precipitacionesMax;
    private Calculador calculador;

    public FiltroPrecipitaciones(double precipitacionesMax, Calculador calculador) {
        this.precipitacionesMax = precipitacionesMax;
        this.calculador = calculador;
    }

    @Override
    public boolean cumple(ArrayList<SensorData> registros) {
        ArrayList<Double> datos = new ArrayList<>();
        for (SensorData registro :registros){
            datos.add(registro.getPrecipitaciones());
        }
        double total = calculador.calcular(datos);
        return  total<precipitacionesMax;
    }
}
