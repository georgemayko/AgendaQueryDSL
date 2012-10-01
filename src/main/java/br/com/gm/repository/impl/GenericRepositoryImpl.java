package br.com.gm.repository.impl;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.gm.model.Model;
import br.com.gm.repository.GenericRepository;


public class GenericRepositoryImpl <T extends Model> implements GenericRepository<T>{
	
	@Inject
	private EntityManager em;

	@Override
	public T save(T entity) {
		em.persist( entity );
		return entity;
	}

	@Override
	public T update( T entity ) {
		return em.merge(entity);
	}

	@Override
	public void delete(T entity) {
		em.remove(entity);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T findById(T entity) {
		return (T) em.find(entity.getClass(), entity.getId());
	}

}
