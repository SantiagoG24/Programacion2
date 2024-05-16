package Final2023;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro extends Enciclopedia {
    public Libro(String titulo, LocalDate año_publicacion, Persona editor) {
        super(titulo, año_publicacion, editor);
    }
}
