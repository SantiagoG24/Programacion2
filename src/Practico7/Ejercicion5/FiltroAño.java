package Practico7.Ejercicion5;

import java.time.LocalDate;
import java.util.Locale;

public class FiltroAño extends Filtro{
    private LocalDate anioMaximo;

    public FiltroAño(LocalDate anioMaximo) {
        this.anioMaximo = anioMaximo;
    }
    public boolean cumple(Pelicula nueva){
        return nueva.getAño_estreno().isBefore(anioMaximo);
    }
}
