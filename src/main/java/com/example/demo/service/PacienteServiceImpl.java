package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Paciente;
import com.example.demo.repository.IPacienteRepository;
@Service
public class PacienteServiceImpl implements IPacienteService {
 @Autowired
 private IPacienteRepository iPacienteRepository;

	@Override
	public void insertar(Paciente paciente) {
		this.iPacienteRepository.insertar(paciente);	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
	
		return this.iPacienteRepository.buscarPorCedula(cedula);
	}

}
