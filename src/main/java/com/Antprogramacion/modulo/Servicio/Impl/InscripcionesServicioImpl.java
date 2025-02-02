package com.Antprogramacion.modulo.Servicio.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Antprogramacion.modulo.Modelo.Inscripciones;
import com.Antprogramacion.modulo.Repositorio.IInscripcionesRepositorio;
import com.Antprogramacion.modulo.Servicio.IInscripcionesServicio;

import java.util.List;

@Service
public class InscripcionesServicioImpl implements IInscripcionesServicio {

    @Autowired
    private IInscripcionesRepositorio repositorio;

    @Override
    public List<Inscripciones> listarInscripciones() {
        return repositorio.findAll();
    }

    @Override
    public Inscripciones obtenerInscripcionPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public void guardarInscripcion(Inscripciones inscripcion) {
        repositorio.save(inscripcion);
    }

    @Override
    public void eliminarInscripcion(Long id) {
        repositorio.deleteById(id);
    }
}
