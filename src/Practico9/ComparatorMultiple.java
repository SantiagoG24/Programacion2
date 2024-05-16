package Practico9;

import java.util.Comparator;

public class ComparatorMultiple implements Comparator<Socio> {
    private Comparator prioritario;
    private Comparator secundario;

    public ComparatorMultiple(Comparator prioritario, Comparator secundario) {
        this.prioritario = prioritario;
        this.secundario = secundario;
    }
    public int compare(Socio so1,Socio so2){
        int res=prioritario.compare(so1,so2);
        if (res==0){
            return  secundario.compare(so1,so2);
        }
        return res;
    }
}
