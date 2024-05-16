package Practico10.Ej6;

public class FiltroCamas extends Filtro{
    private int camasMin;

    public FiltroCamas(int camasMin) {
        this.camasMin = camasMin;
    }

    @Override
    public boolean cumple(Habitacion cuarto) {
        return cuarto.getCamas() > camasMin;
    }
}
