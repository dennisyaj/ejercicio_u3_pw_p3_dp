package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.model.CitaMedica;
import com.example.demo.model.Doctor;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CitaMedica citaMedica) {
		this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		this.entityManager.merge(citaMedica);
	}

	@Override
	public CitaMedica buscarNumero(String numero) {
		TypedQuery<CitaMedica> query = this.entityManager.createQuery("SELECT d FROM CitaMedica d WHERE d.numeroCita=:numero",CitaMedica.class);
		query.setParameter("numero", numero);
		return query.getSingleResult();
	}

}
