package com.example.dbtraductor.servicesinterfaces;

import com.example.dbtraductor.entities.Traduccion;

import java.util.List;

public interface ITraduccionService {
    public List<Traduccion> list();
    public void insert(Traduccion t);
    public void update(Traduccion t);
    public void delete(int id);

    List<String[]> TraduccionesUltimoMes();
}
