package com.Antprogramacion.modulo.Servicio;

import com.Antprogramacion.modulo.Modelo.Horarios;
import java.util.List;

public interface IHorariosServicio {
    List<Horarios> listarHorarios();

    void guardarHorario(Horarios horario);

    Horarios obtenerHorarioPorId(Long id);

    void eliminarHorario(Long id);
}
