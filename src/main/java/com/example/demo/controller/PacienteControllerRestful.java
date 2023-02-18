package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Paciente;
import com.example.demo.repository.IPacienteRepository;
import com.example.demo.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteControllerRestful {
	@Autowired
	private IPacienteService iPacienteService;

	@PostMapping()
	private Paciente insertarPaciente(@RequestBody Paciente paciente) {
		 this.iPacienteService.insertar(paciente);
		 return this.iPacienteService.buscarPorCedula(paciente.getCedula());

	}

	@GetMapping(path = "/cedulas/{cedula}")
	private Paciente buscarPorCedula(@PathVariable(name = "cedula") String cedula) {
		return this.iPacienteService.buscarPorCedula(cedula);
	}

}
