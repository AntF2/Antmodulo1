package com.Antprogramacion.modulo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Antprogramacion.modulo.Modelo.Curso;

@Repository
public interface ICursoRepositorio extends JpaRepository<Curso, Long> {

}
