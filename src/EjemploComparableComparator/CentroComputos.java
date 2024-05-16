package EjemploComparableComparator;

public class CentroComputos {

    private ListaOrdenada computadoras;
    private ListaOrdenada procesos;

    public CentroComputos() {
        computadoras = new ListaOrdenada();
        procesos = new ListaOrdenada();
    }

    public Computadora addProceso(Proceso proc){
        if (computadoras.tieneElementos()){
            //Computadora libre = computadoras.remove(0);
            Computadora libre = (Computadora) computadoras.getSiguienteElemento();
            libre.asignarProceso(proc);
            return libre;
        }
        else{ //tengo que guardar el proceso
            procesos.agregarElemento(proc);
            return null;
        }
    }

    /**
     * Se
     * @param compu
     */
    public void liberarComputadora(Computadora compu){
        compu.liberarComputadora();
        //podria asignarla directamente al primer proceso en espera
        computadoras.agregarElemento(compu);
    }

}
