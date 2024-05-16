package Practico9;

import java.util.ArrayList;

public class FiltroCanchaId extends Filtro{
    public int id_cancha;

    public FiltroCanchaId(int id_cancha) {
        this.id_cancha = id_cancha;
    }
    public boolean cumple(Socio socio){
        ArrayList<Registro> historial = socio.getHistorial();
        for(Registro registro :historial){
            if (registro.getId_cancha() == id_cancha){
                return true;
            }
        }
        return false;
    }
}
