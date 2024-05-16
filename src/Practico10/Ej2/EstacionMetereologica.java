package Practico10.Ej2;

import java.util.ArrayList;

public class EstacionMetereologica {
    private ArrayList<SensorData> registros;

    private final Filtro criterio;
    private int cantidadRegistros;
    public EstacionMetereologica(Filtro criterio) {
        registros= new ArrayList<>();
        this.criterio = criterio;
    }

    public Filtro getCriterio() {
        return criterio;
    }
    public ArrayList<SensorData> getRegistrosN(){
        ArrayList<SensorData> salida= (ArrayList<SensorData>) registros.subList(Math.max(registros.size() - cantidadRegistros, 0), registros.size());
        return salida;
    }

    public int getCantidadRegistros() {
        return cantidadRegistros;
    }

    public void setCantidadRegistros(int cantidadRegistros) {
        this.cantidadRegistros = cantidadRegistros;
    }
    public boolean llueveEnUnaHora(){
        ArrayList<SensorData> registros=getRegistrosN();
        return criterio.cumple(registros);
    }
}
