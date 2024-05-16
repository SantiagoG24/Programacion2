package EjemploComparableComparator;

public class Main {
    public static void main(String[] args) {
        Computadora c1 = new Computadora("comp1", 5, 16);
        Computadora c2 = new Computadora("comp2", 3, 16);
        Computadora c3 = new Computadora("comp3", 9, 32);
        Computadora c4 = new Computadora("comp4", 1, 8);
        Computadora c5 = new Computadora("comp5", 5,32);
        Computadora c6 = new Computadora("comp6", 2,8);

        ListaOrdenada computadoras = new ListaOrdenada();
        computadoras.agregarElemento(c5);
        computadoras.agregarElemento(c1);
        computadoras.agregarElemento(c2);
        computadoras.agregarElemento(c3);
        computadoras.agregarElemento(c4);

        computadoras.agregarElemento(c6);

        System.out.println("Computadoras ordenadas por velocidad");
        System.out.println(computadoras);

        System.out.println("hola".compareTo("hau"));
    }
}