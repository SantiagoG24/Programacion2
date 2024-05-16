package Practico9;

public class FiltroMenorEdad extends Filtro {
    private final int edadMinima=18;
    public boolean cumple(Socio socio){
        return socio.getEdad() > edadMinima;
    }
}
