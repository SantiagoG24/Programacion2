package Final2023;

public class Persona {
    private String nombre;
    private String apellido;
    private String email;

    public Persona(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public boolean equals(Object obj) {
        Persona nueva = (Persona) obj;
        return nueva.getNombre().equals(nombre) && nueva.getApellido().equals(apellido) && nueva.getEmail().equals(email);
    }
}
