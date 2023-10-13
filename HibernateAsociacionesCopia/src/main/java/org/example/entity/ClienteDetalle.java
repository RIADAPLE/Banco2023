package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table
public class ClienteDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean prime;

    @Column(name="puntos_acumulados")
    private Long puntosAcumulados;

    @OneToOne
    @JoinColumn(name="cliente_detalle_id")
    private Cliente cliente;

    public ClienteDetalle(boolean prime, Long puntosAcumulados) {
        this.prime = prime;
        this.puntosAcumulados = puntosAcumulados;
    }

    public ClienteDetalle() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public boolean isPrime() {
        return prime;
    }

    public void setPrime(boolean prime) {
        this.prime = prime;
    }

    public Long getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(Long puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ClienteDetalle{" +
                "id=" + id +
                ", prime=" + prime +
                ", puntosAcumulados=" + puntosAcumulados +
                '}';
    }
}
