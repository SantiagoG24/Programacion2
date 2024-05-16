package Practico9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Club {
    ArrayList<Registro> resgistros;
    ArrayList<Socio> socios;

    public Club() {
        this.resgistros = new ArrayList<>();
        this.socios = new ArrayList<>();
    }
    public ArrayList<Socio> buscar(Filtro filtro, Comparator<Socio> comparator){
        ArrayList<Socio> salida = new ArrayList<>();
        for (Socio socio: socios){
            if (filtro.cumple(socio)){
                salida.add(socio);
            }
        }
        Collections.sort(salida,comparator);
        return salida;
    }
}
