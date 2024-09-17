package com.Antprogramacion.modulo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Antprogramacion.modulo.Repositorio.ICursoRepositorio;
import com.Antprogramacion.modulo.Repositorio.IEstudianteRepositorio;
import com.Antprogramacion.modulo.Repositorio.IHorariosRepositorio;
import com.Antprogramacion.modulo.Repositorio.IInscripcionesRepositorio;
import com.Antprogramacion.modulo.Repositorio.IProfesorRepositorio;

@SpringBootApplication
public class ModuloApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ModuloApplication.class, args);
	}

	@Autowired
	private ICursoRepositorio repositorio;
	private IEstudianteRepositorio repositorio2;
	private IHorariosRepositorio repositorio3;
	private IInscripcionesRepositorio repositorio4;
	private IProfesorRepositorio repositorio5;

	@Override
	public void run(String... args) throws Exception {

	}

}
