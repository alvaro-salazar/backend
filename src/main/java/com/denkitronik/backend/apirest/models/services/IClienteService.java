package com.denkitronik.backend.apirest.models.services;

import java.util.List;

import com.denkitronik.backend.apirest.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.denkitronik.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	List<Cliente> findAll();

	Page<Cliente> findAll(Pageable pageable);

	Cliente save(Cliente cliente);

	Cliente findById(Long id);

	void delete(Long id);

	List<Region> findAllRegiones();
}
