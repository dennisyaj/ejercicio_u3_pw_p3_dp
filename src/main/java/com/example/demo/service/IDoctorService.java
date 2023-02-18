package com.example.demo.service;

import com.example.demo.model.Doctor;

public interface IDoctorService {
	void insertar(Doctor doctor);
	Doctor buscarPorCedula(String cedula);
}
