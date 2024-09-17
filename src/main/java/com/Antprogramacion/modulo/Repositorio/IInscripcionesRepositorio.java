package com.Antprogramacion.modulo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Antprogramacion.modulo.Modelo.Inscripciones;

@Repository
public interface IInscripcionesRepositorio extends JpaRepository<Inscripciones, Long> {

}
