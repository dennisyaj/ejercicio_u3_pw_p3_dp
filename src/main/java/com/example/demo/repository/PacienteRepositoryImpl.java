package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Paciente;
@Transactional
@Repository
public class PacienteRepositoryImpl implements IPacienteRepository {
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Paciente paciente) {
this.entityManager.persist(paciente);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		TypedQuery<Paciente> query = this.entityManager.createQuery("SELECT p FROM Paciente p WHERE p.cedula=:cedula",Paciente.class);
		query.setParameter("cedula", cedula);
		return query.getSingleResult();
	}

}
