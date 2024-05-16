package Practico10.Ej6;
import java.util.ArrayList;

public class CadenaHotel {
    ArrayList<Habitacion> habitaciones;

    public CadenaHotel() {
        habitaciones = new ArrayList<>();
    }
    public void addHabitacion(Habitacion nueva){
        habitaciones.add(nueva);
    }
    public ArrayList<Habitacion> buscar(Filtro filtro){
        ArrayList<Habitacion> salida =new ArrayList<>();
        for (Habitacion cuarto :habitaciones){
            if (filtro.cumple(cuarto)){
                salida.add(cuarto);
            }
        }
        return salida;
    }
}
