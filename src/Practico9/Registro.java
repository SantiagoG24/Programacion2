package Practico9;


import java.time.LocalDate;

public class Registro {
    private LocalDate fecha;
    private int id_cancha;
    private double monto;

    public Registro(LocalDate fecha, int id_cancha, double monto) {
        this.fecha = fecha;
        this.id_cancha = id_cancha;
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getId_cancha() {
        return id_cancha;
    }

    public double getMonto() {
        return monto;
    }
    public boolean cumplo(FiltroCuota.FiltroRegistro filtro){
        return filtro.registroCumple(this);
    }
}
