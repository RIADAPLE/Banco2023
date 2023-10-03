public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String name, String apellido) {
        this.nombre = name;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + " "+ apellido;
    }
}
