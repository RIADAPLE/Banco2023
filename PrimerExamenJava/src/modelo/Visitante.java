package modelo;

public class Visitante {
    private Integer id;
    private String nombre;
    private static Integer ultimoId = 0;

    public Visitante() {
        this.id = ++ultimoId;
    }

    public Visitante(String nombre) {
        this();
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Visitante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
