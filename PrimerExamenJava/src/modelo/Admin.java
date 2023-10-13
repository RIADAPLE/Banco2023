package modelo;

public class Admin {
    private Integer id;
    private String nombre;
    private String contrasena;
    private static Integer ultimoId = 0;

    public Admin() {
        this.id = ++ultimoId;
    }

    public Admin(String nombre, String contrasena) {
        this();
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "modelo.Admin{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }


}
