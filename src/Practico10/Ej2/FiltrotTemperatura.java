package Practico10.Ej2;



import java.util.ArrayList;

public class FiltrotTemperatura extends Filtro{
    private double tepMax;
    private Calculador calculador;

    public FiltrotTemperatura(double tepMax) {
        this.tepMax = tepMax;
    }

    public double getTepMax() {
        return tepMax;
    }

    public void setTepMax(double tepMax) {
        this.tepMax = tepMax;
    }

    @Override
    public boolean cumple(ArrayList<SensorData>registros) {
        ArrayList<Double> datos =new ArrayList<>();
        for (SensorData registro  :registros){
            datos.add(registro.getTemperatura());
        }
        double total= calculador.calcular(datos);
        return total<tepMax;
    }
}
