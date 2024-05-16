package EjemploComparableComparator;

public class Proceso implements Comparable<Proceso>{
    private int memoriaReq;

    public Proceso(int memoriaReq) {
        this.memoriaReq = memoriaReq;
    }

    public int getMemoriaReq() {
        return memoriaReq;
    }

    @Override
    public String toString() {
        return ""+memoriaReq;
    }

    @Override
    public int compareTo(Proceso otro){
        return this.getMemoriaReq() - otro.getMemoriaReq();
    }
}
