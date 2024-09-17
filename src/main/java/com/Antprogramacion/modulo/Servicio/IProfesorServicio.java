package com.Antprogramacion.modulo.Servicio;

import java.util.List;
import com.Antprogramacion.modulo.Modelo.Profesor;

public interface IProfesorServicio {
    List<Profesor> listarProfesores();

    void guardarProfesor(Profesor profesor);

    Profesor obtenerProfesorPorId(Long id);

    void eliminarProfesor(Long id);
}
