package com.Antprogramacion.modulo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Antprogramacion.modulo.Modelo.Estudiante;

@Repository
public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Long> {

}
