package modelo;

public class RealizarPago {
    private Integer id;
    private Double Importe;
    private Integer idTransaccion;
    //En lugar de simplemente utilizar el id del usuario,
    //se relaciona directamente con una instancia de usuario
    private UsuarioRegistrado usuario;
    private static Integer ultimoId = 0;


    public RealizarPago() {
        this.id = ++ultimoId;
    }

    public RealizarPago(Double importe, Integer idTransaccion, UsuarioRegistrado usuario) {
        this();
        Importe = importe;
        this.idTransaccion = idTransaccion;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getImporte() {
        return Importe;
    }

    public void setImporte(Double importe) {
        Importe = importe;
    }

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public UsuarioRegistrado getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioRegistrado usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "modelo.RealizarPago{" +
                "id=" + id +
                ", Importe=" + Importe +
                ", idTransaccion=" + idTransaccion +
                ", usuario=" + usuario +
                '}';
    }
}
