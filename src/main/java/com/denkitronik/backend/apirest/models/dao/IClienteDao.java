package com.denkitronik.backend.apirest.models.dao;

import com.denkitronik.backend.apirest.models.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.denkitronik.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
    @Query("from Region")
    public List<Region> findAllRegiones();
}
