package com.challengeTecnico.AutoModos.NicolasTu.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EstadoAuto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int velocidad;
    private boolean camuflajeActivo;
    private boolean armasActivas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isCamuflajeActivo() {
        return camuflajeActivo;
    }

    public void setCamuflajeActivo(boolean camuflajeActivo) {
        this.camuflajeActivo = camuflajeActivo;
    }

    public boolean isArmasActivas() {
        return armasActivas;
    }

    public void setArmasActivas(boolean armasActivas) {
        this.armasActivas = armasActivas;
    }
}
