package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctor;
import com.example.demo.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepository iDoctorRepository;

	@Override
	public void insertar(Doctor doctor) {
		this.iDoctorRepository.insertar(doctor);
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		return this.iDoctorRepository.buscarPorCedula(cedula);
	}

}
