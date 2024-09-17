package com.Antprogramacion.modulo.Servicio;

import java.util.List;

import com.Antprogramacion.modulo.Modelo.Curso;

public interface ICursoServicio {

    public List<Curso> listarCursos();

    void guardarCurso(Curso curso);

    void eliminarCurso(Long id);

    Curso obtenerCursoPorId(Long id);

}
