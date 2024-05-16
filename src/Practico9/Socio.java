package Practico9;

import java.util.ArrayList;

public class Socio implements Comparable<Socio>{
    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuota_paga;
    private ArrayList<Registro> historial;
    public Socio(String nombre, String apellido, int edad, boolean cuota_paga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuota_paga = cuota_paga;
        this.historial= new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Registro> getHistorial() {
        ArrayList<Registro> salida= new ArrayList<>();
        for (Registro registro: historial){
            salida.add(registro);
        }
        return salida;
    }
    public boolean isCuota_paga() {
        return cuota_paga;
    }


    @Override
    public int compareTo(Socio socio) {
        return getApellido().compareTo(socio.getApellido());
    }
}
