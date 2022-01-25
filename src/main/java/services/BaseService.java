package services;

import antlr.collections.List;

public interface BaseService<E> {
	public List findAll() throws Exception;
	public E findById(Long id) throws Exception;
	public E save(E entitiy) throws Exception;
	public E update(Long id, E entity) throws Exception;
	public boolean delete(Long id) throws Exception;
}

