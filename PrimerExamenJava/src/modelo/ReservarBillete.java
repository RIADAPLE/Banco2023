package modelo;

import java.util.Date;

public class ReservarBillete {

    private Integer id;
    private Integer numeroEntradasDisponibles;

    //La película será guardada como objeto película
    //Y no solo como String de su nombre
    private Pelicula pelicula;
    private Integer mostrarNumero;
    private Date fecha;
    private String hora;
    private String lugar;
    private Integer ultimoId = 0;

    public ReservarBillete() {
        this.id = ++ultimoId;
    }

    public ReservarBillete(Integer numeroEntradasDisponibles, Pelicula pelicula, Integer mostrarNumero, Date fecha, String hora, String lugar) {
        this();
        this.numeroEntradasDisponibles = numeroEntradasDisponibles;
        this.pelicula = pelicula;
        this.mostrarNumero = mostrarNumero;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }

    public Integer getNumeroEntradasDisponibles() {
        return numeroEntradasDisponibles;
    }

    public void setNumeroEntradasDisponibles(Integer numeroEntradasDisponibles) {
        this.numeroEntradasDisponibles = numeroEntradasDisponibles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getMostrarNumero() {
        return mostrarNumero;
    }

    public void setMostrarNumero(Integer mostrarNumero) {
        this.mostrarNumero = mostrarNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "ReservarBillete{" +
                "id=" + id +
                ", numeroEntradasDisponibles=" + numeroEntradasDisponibles +
                ", pelicula=" + pelicula +
                ", mostrarNumero=" + mostrarNumero +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", ultimoId=" + ultimoId +
                '}';
    }
}
