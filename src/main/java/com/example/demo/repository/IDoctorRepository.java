package com.example.demo.repository;

import com.example.demo.model.Doctor;

public interface IDoctorRepository {
	void insertar(Doctor doctor);
	Doctor buscarPorCedula(String cedula);
}
