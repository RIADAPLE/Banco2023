package modelo;

import java.util.Date;

public class Pelicula {
    private Integer id;
    private String NombreDePelicula;
    private Date PeliculaEspectaculo;
    private String lugar;
    private static Integer ultimoId = 0;

    public Pelicula() {
        this.id = ++ultimoId;
    }

    public Pelicula(String nombreDePelicula, Date peliculaEspectaculo, String lugar) {
        this();
        NombreDePelicula = nombreDePelicula;
        PeliculaEspectaculo = peliculaEspectaculo;
        this.lugar = lugar;
    }

    public void DetallesActualizacion(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreDePelicula() {
        return NombreDePelicula;
    }

    public void setNombreDePelícula(String nombreDePelícula) {
        NombreDePelicula = nombreDePelícula;
    }

    public Date getPeliculaEspectáculo() {
        return PeliculaEspectaculo;
    }

    public void setPeliculaEspectáculo(Date peliculaEspectáculo) {
        PeliculaEspectaculo = peliculaEspectáculo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", NombreDePelicula='" + NombreDePelicula + '\'' +
                ", PeliculaEspectaculo=" + PeliculaEspectaculo +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}
