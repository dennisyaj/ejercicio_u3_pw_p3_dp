package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.TO.CitaMedicaActualizacionTO;
import com.example.demo.service.TO.CitaMedicaTO;

@RestController
@RequestMapping("/citasMedicas")
public class CitaMedicaControllerRestFul {

	@Autowired
	private ICitaMedicaService iCitaMedicaService;

	@PostMapping
	private void agendarCitaMedica(@RequestBody CitaMedicaTO citaMedicaTO) {
		this.iCitaMedicaService.insertar(citaMedicaTO);
	}

	@PutMapping(path = "/{id}")
	private void actualizarCitaMedica(@PathVariable("id") String id,
			@RequestBody CitaMedicaActualizacionTO citaMedicaActualizacionTO) {
		this.iCitaMedicaService.actualizar(id, citaMedicaActualizacionTO);
	}
}
