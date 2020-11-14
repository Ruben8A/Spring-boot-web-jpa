package com.curso.springboot.web.app.models.service;

import java.util.List;

import com.curso.springboot.web.app.models.entity.Cliente;

public interface IClienteService {
	List<Cliente> findAll();

	public void save(Cliente cliente);

	public Cliente findOne(Long id);

	public void delete(Long id);
}
