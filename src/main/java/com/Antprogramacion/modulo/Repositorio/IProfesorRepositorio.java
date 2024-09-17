package com.Antprogramacion.modulo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Antprogramacion.modulo.Modelo.Profesor;

@Repository
public interface IProfesorRepositorio extends JpaRepository<Profesor, Long> {

}