package com.example.demo.service;

import com.example.demo.model.CitaMedica;
import com.example.demo.service.TO.CitaMedicaActualizacionTO;
import com.example.demo.service.TO.CitaMedicaTO;

public interface ICitaMedicaService {
	
	void insertar(CitaMedicaTO citaMedicaTO);

	void actualizar(String id, CitaMedicaActualizacionTO citaMedicaActualizacionTO);
	CitaMedica buscarNumero(String numero);
}
