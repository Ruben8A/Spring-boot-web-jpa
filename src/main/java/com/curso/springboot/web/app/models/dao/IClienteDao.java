package com.curso.springboot.web.app.models.dao;



import org.springframework.data.repository.CrudRepository;

import com.curso.springboot.web.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
}
