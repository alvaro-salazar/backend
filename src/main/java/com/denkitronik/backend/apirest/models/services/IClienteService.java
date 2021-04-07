package com.denkitronik.backend.apirest.models.services;

import java.util.List;

import com.denkitronik.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

}
