package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Doctor;
import com.example.demo.model.Paciente;

@Transactional
@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Doctor doctor) {
		this.entityManager.persist(doctor);
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		TypedQuery<Doctor> query = this.entityManager.createQuery("SELECT d FROM Doctor d WHERE d.cedula=:cedula",Doctor.class);
		query.setParameter("cedula", cedula);
		return query.getSingleResult();
	}

}
