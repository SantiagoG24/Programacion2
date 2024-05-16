package Practico9;

import java.util.Comparator;

public class ComparatorCuotaPaga implements Comparator<Socio>{

    public int compare(Socio so1,Socio so2){
        return Boolean.compare(so1.isCuota_paga(),so2.isCuota_paga());
    }
}
