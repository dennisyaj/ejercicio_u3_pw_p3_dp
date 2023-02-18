package com.example.demo.service.TO;

import java.time.LocalDateTime;

public class CitaMedicaActualizacionTO {

	private LocalDateTime fechaProximaCita;

	private String diagnostico;

	private String receta;
	//gets and sets

	public LocalDateTime getFechaProximaCita() {
		return fechaProximaCita;
	}

	public void setFechaProximaCita(LocalDateTime fechaProximaCita) {
		this.fechaProximaCita = fechaProximaCita;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}
	
	
	
}
