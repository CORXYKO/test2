package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.TraduccionDto;
import com.example.dbtraductor.dtos.TraduccionUltimoMesDto;
import com.example.dbtraductor.entities.Traduccion;
import com.example.dbtraductor.servicesinterfaces.ITraduccionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/traducciones")
public class TraduccionController {
    @Autowired
    private ITraduccionService tS;
    @GetMapping
    public List<TraduccionDto> listar(){
        return tS.list().stream().map(t->{
            ModelMapper m = new ModelMapper();
            return m.map(t, TraduccionDto.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody TraduccionDto dto){
        ModelMapper m = new ModelMapper();
        Traduccion r = m.map(dto, Traduccion.class);
        tS.insert(r);
    }
    @PutMapping
    public void modificar(@RequestBody TraduccionDto dto){
        ModelMapper m = new ModelMapper();
        Traduccion r = m.map(dto, Traduccion.class);
        tS.update(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id")int id){
        tS.delete(id);
    }

    @GetMapping("/TraduccionesUltimoMes")
    public List<TraduccionUltimoMesDto> listarTraduccionesUltimoMes(){
        List<String[]> filaLista=tS.TraduccionesUltimoMes();
        List<TraduccionUltimoMesDto> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            TraduccionUltimoMesDto dto=new TraduccionUltimoMesDto();
            dto.setNombre(columna[0]);
            dto.setTraduccionUltimoMes(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
