package com.example.dbtraductor.dtos;

import com.example.dbtraductor.entities.Rol;
import com.example.dbtraductor.entities.Usuario;

import java.time.LocalDate;

public class TraduccionDto {
    private int idTraduccion;
    private String lenguaje_programacion;
    private String codigo_original;
    private String codigo_traducido;
    private LocalDate fecha_traduccion;
    private Usuario idUsuario;

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
