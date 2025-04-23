package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Traduccion;
import com.example.dbtraductor.repositories.ITraduccionRepository;
import com.example.dbtraductor.servicesinterfaces.ITraduccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraduccionServiceImplement implements ITraduccionService {
    @Autowired
    private ITraduccionRepository tR;
    @Override
    public List<Traduccion> list(){
        return tR.findAll();
    }
    public void insert(Traduccion traduccion){tR.save(traduccion);}

    @Override
    public void update(Traduccion t) {
        tR.save(t);
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }
}
