package com.example.dbtraductor.servicesinterfaces;
import com.example.dbtraductor.entities.Traduccion;

import java.util.List;

public interface ITraduccionService {
    public List<Traduccion> list();
    public void insert (Traduccion a);
    public Traduccion searchId(int id);
    public void update (Traduccion a);
    public void delete (int id);
}
