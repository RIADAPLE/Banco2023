package modelo;

public class UsuarioRegistrado {
    private Integer id;
    private String nombre;
    private Integer numeroTelefono;
    private String direccion;
    private static Integer ultimoId = 0;

    public UsuarioRegistrado() {
        this.id = ++ultimoId;
    }

    public UsuarioRegistrado(String nombre, Integer numeroTelefono, String direccion) {
        this();
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
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

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static Integer getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(Integer ultimoId) {
        UsuarioRegistrado.ultimoId = ultimoId;
    }

    @Override
    public String toString() {
        return "UsuarioRegistrado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
