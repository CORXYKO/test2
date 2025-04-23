package com.example.dbtraductor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="Traduccion")
public class Traduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTraduccion;
    @Column(name = "lenguaje_programacion", nullable = false,length = 20)
    private String lenguaje_programacion;
    @Column(name = "codigo_original", nullable = false,length = 500)
    private String codigo_original;
    @Column(name = "codigo_traducido", nullable = false,length = 500)
    private String codigo_traducido;
    @Column(name = "fecha_traduccion", nullable = false)
    private LocalDate fecha_traduccion;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario idUsuario;

    public Traduccion() {}

    public Traduccion(int idTraduccion, String lenguaje_programacion, String codigo_original, String codigo_traducido, LocalDate fecha_traduccion, Usuario idUsuario) {
        this.idTraduccion = idTraduccion;
        this.lenguaje_programacion = lenguaje_programacion;
        this.codigo_original = codigo_original;
        this.codigo_traducido = codigo_traducido;
        this.fecha_traduccion = fecha_traduccion;
        this.idUsuario = idUsuario;
    }

    public int getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(int idTraduccion) {
        this.idTraduccion = idTraduccion;
    }

    public String getLenguaje_programacion() {
        return lenguaje_programacion;
    }

    public void setLenguaje_programacion(String lenguaje_programacion) {
        this.lenguaje_programacion = lenguaje_programacion;
    }

    public String getCodigo_original() {
        return codigo_original;
    }

    public void setCodigo_original(String codigo_original) {
        this.codigo_original = codigo_original;
    }

    public String getCodigo_traducido() {
        return codigo_traducido;
    }

    public void setCodigo_traducido(String codigo_traducido) {
        this.codigo_traducido = codigo_traducido;
    }

    public LocalDate getFecha_traduccion() {
        return fecha_traduccion;
    }

    public void setFecha_traduccion(LocalDate fecha_traduccion) {
        this.fecha_traduccion = fecha_traduccion;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
}
