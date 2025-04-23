package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

}
