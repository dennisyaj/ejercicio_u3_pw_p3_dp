package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Doctor;
import com.example.demo.service.IDoctorService;

@RestController
@RequestMapping("/doctores")
public class DoctorControllerRestful {
	@Autowired
	private IDoctorService iDoctorService;

	@PostMapping
	private void guardarDoctor(@RequestBody Doctor doctor) {
		this.iDoctorService.insertar(doctor);
	}
	
	@GetMapping(path = "/{id}")
	private Doctor obtener(@PathVariable("id") String cedula) {
		return this.iDoctorService.buscarPorCedula(cedula);
	}
}
