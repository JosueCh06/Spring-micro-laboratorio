package com.micro.laboratorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.laboratorio.entity.Laboratorio;


public interface LaboratorioDAO extends JpaRepository<Laboratorio, Integer>{

}
