package Practico10.Ej6;

public class FiltroEstaLibre extends Filtro{
    @Override
    public boolean cumple(Habitacion cuarto) {
        return cuarto.estaLibre();
    }
}
