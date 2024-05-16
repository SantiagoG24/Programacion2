package EjemploComparableComparator;

public class Computadora implements Comparable<Computadora>{
    private double velocidad;
    private int memoria;
    private String nombre;
    Proceso ejecutando;

    public int getMemoria() {
        return memoria;
    }

    public Computadora(String nombre, int velocidad, int memoria) {
        this.velocidad = velocidad;
        this.nombre = nombre;
        this.memoria = memoria;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return this.getNombre() +
                " (vel="+this.getVelocidad()+
                " mem="+this.getMemoria()+")";
    }

    public void asignarProceso(Proceso proc) {
        ejecutando = proc;
    }

    public boolean estaLibre(){
        return ejecutando==null;
    }

    public void liberarComputadora(){
        this.ejecutando = null;
    }


    @Override
    public int compareTo(Computadora otro) {
        if (this.getVelocidad()<otro.getVelocidad())
            return -5;
        else if (this.getVelocidad()>otro.getVelocidad())
                return 1;
        else {
            return this.getMemoria() - otro.getMemoria();
        }
        //return (int) this.getVelocidad() - (int) otro.getVelocidad();
        //return this.getNombre().compareTo(otro.getNombre());
    }
}
