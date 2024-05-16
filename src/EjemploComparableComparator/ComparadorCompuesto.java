package EjemploComparableComparator;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Persona> {
    private Comparator<Persona> primerCriterio, segundoCriterio;

    public ComparadorCompuesto(Comparator<Persona> primerCriterio, Comparator<Persona> segundoCriterio) {
        this.primerCriterio = primerCriterio;
        this.segundoCriterio = segundoCriterio;
    }

    @Override
    public int compare(Persona o1, Persona o2) {
        int res = primerCriterio.compare(o1, o2);
        if (res!=0)
            return res;
        else return segundoCriterio.compare(o1,o2);
    }
}
