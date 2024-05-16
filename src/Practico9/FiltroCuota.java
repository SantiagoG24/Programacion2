package Practico9;

public class FiltroCuota extends Filtro{
    public boolean cumple(Socio socio){
        return socio.isCuota_paga();
    }

    public abstract static class FiltroRegistro {
        public abstract boolean registroCumple(Registro registro);
    }
}
