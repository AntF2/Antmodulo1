package com.Antprogramacion.modulo.Servicio.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Antprogramacion.modulo.Modelo.Curso;
import com.Antprogramacion.modulo.Repositorio.ICursoRepositorio;
import com.Antprogramacion.modulo.Servicio.ICursoServicio;

@Service
public class CursoServicioImpl implements ICursoServicio {

    @Autowired
    private ICursoRepositorio repositorio;

    @Override
    public List<Curso> listarCursos() {
        return repositorio.findAll();
    }

    @Override
    public void guardarCurso(Curso curso) {
        repositorio.save(curso);
    }

    @Override
    public void eliminarCurso(Long id) {
        repositorio.deleteById(id);
    }

    @Override
    public Curso obtenerCursoPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }
}