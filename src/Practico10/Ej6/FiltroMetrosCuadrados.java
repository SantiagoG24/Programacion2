package Practico10.Ej6;

public class FiltroMetrosCuadrados extends Filtro{
    int metrosMax;

    public FiltroMetrosCuadrados(int metrosMax) {
        this.metrosMax = metrosMax;
    }

    @Override
    public boolean cumple(Habitacion cuarto) {
        return cuarto.getMetrosCuadrados() < metrosMax;
    }
}
