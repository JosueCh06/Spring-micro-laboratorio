package com.micro.laboratorio.serviceImpl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.laboratorio.service.ICRUD;


public abstract class ICRUDImpl<T,ID> implements ICRUD<T, ID>{

	public abstract JpaRepository<T, ID> getRepository();
	
	@Override
	public T registrar(T bean) throws Exception {
		// TODO Auto-generated method stub
		return getRepository().save(bean);
	}

	@Override
	public T actualizar(T bean) throws Exception {
		// TODO Auto-generated method stub
		return getRepository().save(bean);
	}

	@Override
	public void eliminar(ID cod) throws Exception {
		// TODO Auto-generated method stub
		getRepository().deleteById(cod);
	}

	@Override
	public T buscarPorId(ID cod) throws Exception {
		// TODO Auto-generated method stub
		return getRepository().findById(cod).orElse(null);
	}

	@Override
	public List<T> listarTodos() throws Exception {
		// TODO Auto-generated method stub
		return getRepository().findAll();
	}

}
