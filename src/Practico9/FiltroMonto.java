package Practico9;

public class FiltroMonto extends Filtro{
    private double montoMinimo;

    public FiltroMonto(double montoMinimo) {
        this.montoMinimo = montoMinimo;
    }
    public boolean cumple(Socio socio){
        for (Registro registro :socio.getHistorial()){
            if (registro.getMonto() > montoMinimo){
                return true;
            }
        }
        return false;
    }
}
