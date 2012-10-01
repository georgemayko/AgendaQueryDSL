package br.com.gm.repository;

import br.com.gm.model.Model;

public interface GenericRepository <T extends Model> {
	
	public T save ( T entity );
	public T update ( T entity );
	public void delete ( T entity);
	public T findById ( T entity );
	
}
