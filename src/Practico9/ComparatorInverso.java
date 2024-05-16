package Practico9;

import java.util.Comparator;

public class ComparatorInverso implements Comparator<Socio> {
    private Comparator comparator;

    public Comparator getComparator() {
        return comparator;
    }

    public ComparatorInverso(Comparator comparator) {
        this.comparator = comparator;
    }
    public int compare(Socio so1,Socio so2){
        return -1 * getComparator().compare(so1,so2);
    }
}
