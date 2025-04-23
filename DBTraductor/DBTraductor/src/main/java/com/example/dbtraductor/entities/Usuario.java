package com.example.dbtraductor.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;

    @Column(name = "telefono", nullable = false)
    private int telefono;

    @Column(name = "fechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "email", nullable = false, length = 30)
    private String email;

    @Column(name = "password", nullable = false, length = 30)
    private String password;

    @ManyToOne
    @JoinColumn(name ="idRol")
    private Rol idRol;

    /*@Column(name = "rolid", nullable = false)
    private int rolid;*/




    public Usuario(int idApp, String nombre, int telefono, LocalDate fechaNacimiento, String email, String password, Rol idRol/* int rolid*/  ) {
        this.idUsuario = idApp;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.password = password;
        this.idRol = idRol;
     //  this.rolid = rolid;
    }

    public Usuario() {
    }

    public int getIdApp() {
        return idUsuario;
    }

    public void setIdApp(int idApp) {
        this.idUsuario = idApp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }

  /*
    public int getRolid() {
        return rolid;
    }

    public void setRolid(int rolid) {
        this.rolid = rolid;
    }
    */
}
