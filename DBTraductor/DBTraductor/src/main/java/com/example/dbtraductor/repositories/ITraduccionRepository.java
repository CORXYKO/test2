package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Traduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITraduccionRepository extends JpaRepository<Traduccion, Integer> {
    @Query(value="SELECT t.*, u.nombre AS nombre_usuario\n" +
            " FROM Traduccion t\n" +
            " JOIN Usuario u ON t.usuario_id = u.id\n" +
            " WHERE EXTRACT(MONTH FROM t.fecha_traduccion) = EXTRACT(MONTH FROM CURRENT_DATE)\n" +
            "  AND EXTRACT(YEAR FROM t.fecha_traduccion) = EXTRACT(YEAR FROM CURRENT_DATE)\n" +
            " ORDER BY t.fecha_traduccion DESC;",nativeQuery=true)

    public List<String[]> TraduccionesUltimoMes();

}
