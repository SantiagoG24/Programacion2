package FinalLibre2023;

import FinalLibre2023.Filtros.Filtro;

import java.util.ArrayList;

public class App{
    ArrayList<Entrenamiento> disponibles;

    public App() {
        this.disponibles =new ArrayList<>();
    }
    public ArrayList<Entrenamiento> buscar(Filtro filtro){
        ArrayList<Entrenamiento> salida= new ArrayList<>();
        for (Entrenamiento  entrenamiento: disponibles){
             salida.addAll(entrenamiento.cumple(filtro));
        }
        return salida;
    }
}
