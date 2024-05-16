package EjemploComparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Persona implements Comparable<Persona>{
    private String apellido;
    private String nombre;
    private int edad;

    public Persona(String apellido, String nombre, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}'+"\n";
    }

    public static void main(String[] args) {
        Persona p1 =  new Persona("Perez", "Maria", 25);
        Persona p2 =  new Persona("Perez", "Juan", 30);
        Persona p3 =  new Persona("Alvarez", "Maria", 15);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        System.out.println(personas);
        Collections.sort(personas, Collections.reverseOrder());
        System.out.println("Ordenasdas por edad (orden natural)");
        System.out.println(personas);

        System.out.println("Ordenasdas por nombre");
        Collections.sort(personas, new ComparadorNombre().reversed());
        System.out.println(personas);
    }

    @Override
    public int compareTo(Persona otra) {
        return this.getEdad() - otra.getEdad();
    }
}
