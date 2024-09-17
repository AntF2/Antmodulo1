package com.Antprogramacion.modulo.Servicio;

import java.util.List;

import com.Antprogramacion.modulo.Modelo.Estudiante;

public interface IEstudianteServicio {
    public List<Estudiante> listarEstudiantes();

    void guardarEstudiante(Estudiante estudiante);

    void eliminarEstudiante(Long id);

    Estudiante obtenerEstudiantePorId(Long id);

}
