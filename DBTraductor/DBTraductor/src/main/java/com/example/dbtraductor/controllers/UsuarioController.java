package com.example.dbtraductor.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.dbtraductor.dtos.UsuarioDto;
import com.example.dbtraductor.entities.Usuario;
import com.example.dbtraductor.servicesinterfaces.IUsuarioService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService aS;

    @GetMapping
    public List<UsuarioDto> listar() {
        return aS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody UsuarioDto dto) {
        ModelMapper m = new ModelMapper();
        Usuario a = m.map(dto, Usuario.class);
        aS.insert(a);
    }

    /*search id */
    @GetMapping("/{id}")
    public UsuarioDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        UsuarioDto dto = m.map(aS.searchId(id), UsuarioDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDto dto) {
        ModelMapper m = new ModelMapper();
        Usuario a = m.map(dto, Usuario.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {aS.delete(id);}

}
