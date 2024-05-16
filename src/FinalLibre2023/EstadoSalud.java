package FinalLibre2023;

import java.util.Objects;

public class EstadoSalud {
    private String nombre;
    private int valor;
    private String descripcion;

    public EstadoSalud(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
        descripcion="";
    }

    public EstadoSalud(String nombre, int valor, String descripcion) {
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = this.valor *valor / 100;
    }

    @Override
    public String toString() {
        return nombre + valor + descripcion;
    }

    @Override
    public boolean equals(Object o) {
        EstadoSalud nuevo = (EstadoSalud) o;
        return nuevo.getNombre().equals(nombre);
    }
}
