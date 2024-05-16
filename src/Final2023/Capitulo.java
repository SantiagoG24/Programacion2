package Final2023;

import java.time.LocalDate;
import java.util.ArrayList;

public class Capitulo extends Enciclopedia{
    private int cantidad_paginas;
    private String tema;
    private ArrayList<Persona> autores;


    public Capitulo(String titulo, LocalDate año_publicacion, Persona editor, int cantidad_paginas, String tema) {
        super(titulo, null, editor);
        this.cantidad_paginas = cantidad_paginas;
        this.tema = tema;
        this.autores = new ArrayList<>();
    }


    public void addAutor(Persona persona){
        if (super.getEditor()!=null){
            if (!autores.contains(super.getEditor())){
                autores.add(persona);
            }
        }
    }
}
