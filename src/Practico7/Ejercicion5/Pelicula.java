package Practico7.Ejercicion5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private String genero;
    private String director;
    private ArrayList<String> actores;
    private LocalDate Año_estreno;
    private double duracion;
    private int edad_minima;

    public Pelicula(String titulo, String sinopsis, String genero, String director, LocalDate año_estreno, double duracion, int edad_minima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.director = director;
        this.actores = new ArrayList<>();
        Año_estreno = año_estreno;
        this.duracion = duracion;
        this.edad_minima = edad_minima;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public String getDirector() {
        return director;
    }
    public LocalDate getAño_estreno() {
        return Año_estreno;
    }

    public ArrayList<String> getActores() {
        ArrayList<String> salida =new ArrayList<>();
        for (String actor: actores){
            salida.add(actor);
        }
        return salida;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getEdad_minima() {
        return edad_minima;
    }
    public boolean esExitosa(Filtro filtro){
        return filtro.cumple(this);
    }
}
