package Final2023;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Enciclopedia {
    private String titulo;
    private LocalDate año_publicacion;
    private Persona editor;
    private ArrayList<Enciclopedia> enciclopedia;

    public Enciclopedia(String titulo, LocalDate año_publicacion, Persona editor) {
        this.titulo = titulo;
        this.año_publicacion = año_publicacion;
        this.editor = editor;
        this.enciclopedia=new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getAño_publicacion() {
        return año_publicacion;
    }

    public Persona getEditor() {
        return editor;
    }
}
