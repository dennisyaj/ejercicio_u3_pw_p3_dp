package com.example.demo.repository;

import com.example.demo.model.Paciente;

public interface IPacienteRepository {
	void insertar(Paciente paciente);

	Paciente buscarPorCedula(String cedula);
}
