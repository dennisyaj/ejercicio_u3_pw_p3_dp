package com.example.demo.service;

import com.example.demo.model.Paciente;

public interface IPacienteService {
	
	void insertar(Paciente paciente);

	Paciente buscarPorCedula(String cedula);
}
