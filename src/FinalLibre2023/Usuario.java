package FinalLibre2023;

import FinalLibre2023.Filtros.Filtro;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Entrenamiento> entrenamientos;
    private ArrayList<EstadoSalud> estado_salud;
    private ArrayList<Efecto> efectos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.entrenamientos = new ArrayList<>();
        this.estado_salud = new ArrayList<>();
        this.efectos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void set(EstadoSalud atributo, int efecto){
        for (EstadoSalud estado: estado_salud){
            if (estado.equals(atributo)){
                estado.setValor(efecto);
            }
        }
    }
    public void ejecercitarce(Filtro ff){
        for (Entrenamiento entrenamiento : entrenamientos){
            entrenamiento.ejecutar();
            for (Efecto efecto : efectos){
                efecto.cumple(ff);
            }
        }
    }
    public int compareTo(Usuario otro){
        return getNombre().compareTo(otro.getNombre());
    }
}
