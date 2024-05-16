package Practico10.Ej6;

import java.util.ArrayList;

public class FiltroComodidades extends Filtro{
    private String comodidad;

    public FiltroComodidades(String comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public boolean cumple(Habitacion cuarto) {
        return cuarto.comodidadesContains(comodidad);
    }
}
