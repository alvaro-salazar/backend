package com.denkitronik.backend.apirest.models.services;

import java.util.List;

import com.denkitronik.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	List<Cliente> findAll();

	Cliente save(Cliente cliente);

	Cliente findById(Long id);

	void delete(Long id);
}
