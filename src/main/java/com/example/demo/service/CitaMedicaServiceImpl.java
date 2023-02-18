package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CitaMedica;
import com.example.demo.repository.ICitaMedicaRepository;
import com.example.demo.service.TO.CitaMedicaActualizacionTO;
import com.example.demo.service.TO.CitaMedicaTO;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {

	@Autowired
	private IPacienteService iPacienteService;
	@Autowired
	private IDoctorService iDoctorService;
	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;

	@Override
	public void insertar(CitaMedicaTO citaMedicaTO) {
		
		this.iCitaMedicaRepository.insertar(this.convertirCitaMedicaTo(citaMedicaTO));
	}

	@Override
	public void actualizar(String id, CitaMedicaActualizacionTO citaMedicaActualizacionTO) {
		
		CitaMedica citaMedica= this.buscarNumero(id);
	}

	private CitaMedica convertirCitaMedicaTo(CitaMedicaTO citaMedicaTO) {
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setFechaCita(citaMedicaTO.getFechaCita());
		citaMedica.setLugarCita(citaMedicaTO.getLugarCita());
		citaMedica.setNumeroCita(citaMedicaTO.getNumeroCita());
		citaMedica.setValorCita(citaMedicaTO.getValorCita());
		citaMedica.setDoctor(this.iDoctorService.buscarPorCedula(citaMedicaTO.getCedulaDoctor()));
		citaMedica.setPaciente(this.iPacienteService.buscarPorCedula(citaMedicaTO.getCedulaPaciente()));
		return citaMedica;

	}

	@Override
	public CitaMedica buscarNumero(String numero) {
		return this.iCitaMedicaRepository.buscarNumero(numero);
	}
}
