package EjemploComparableComparator;

import java.util.ArrayList;

public class ListaOrdenada {

    private ArrayList<Comparable> elementos;

    public ListaOrdenada() {
        elementos = new ArrayList();
    }

    public Comparable getSiguienteElemento(){
        if (elementos.isEmpty())
            return null;
        return elementos.remove(0);
    }

    public boolean tieneElementos(){
        return !elementos.isEmpty();
    }

    public void agregarElemento(Comparable elemento) {
        //guardar Ordenado
        boolean encontro = false;
        int i = 0;
        while (!encontro && i< elementos.size()) {
            if (elemento.compareTo(elementos.get(i))<0)
                i++;
            else
                encontro = true;
        }
        if (encontro)
            elementos.add(i,elemento);
        else
            elementos.add(elemento);
    }

    public int cantElementos(){
        return elementos.size();
    }

    public String toString(){
        String str = "[";
        for (int i = 0; i < elementos.size(); i++) {
            str += elementos.get(i);
            if (i<elementos.size()-1)
                str += ", \n";
        }
        str += "]";
        return str;
    }
}
