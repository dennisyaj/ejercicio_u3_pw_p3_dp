package com.example.demo.repository;

import com.example.demo.model.CitaMedica;

public interface ICitaMedicaRepository {
	
	void insertar(CitaMedica citaMedica);

	void actualizar(CitaMedica citaMedica);
	
	CitaMedica buscarNumero(String numero);
}
