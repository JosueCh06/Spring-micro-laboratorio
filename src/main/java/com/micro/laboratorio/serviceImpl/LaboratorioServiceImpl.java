package com.micro.laboratorio.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.micro.laboratorio.entity.Laboratorio;
import com.micro.laboratorio.repository.LaboratorioDAO;

@Service
public class LaboratorioServiceImpl extends ICRUDImpl<Laboratorio, Integer>{

	@Autowired
	private LaboratorioDAO laboratorioDAO;

	@Override
	public JpaRepository<Laboratorio, Integer> getRepository() {
		// TODO Auto-generated method stub
		return laboratorioDAO;
	}

}
