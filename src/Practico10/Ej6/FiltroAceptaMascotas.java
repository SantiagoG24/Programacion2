package Practico10.Ej6;

public class FiltroAceptaMascotas extends Filtro{
    @Override
    public boolean cumple(Habitacion cuarto) {
        return cuarto.getAceptaMascotas();
    }

}
