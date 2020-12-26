package com.Developers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Developers.modelo.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
	
	 List<Proyecto> findByPais (String pais);

	 List<Proyecto> findByFinanciador(String financiador);

	
	    
	
}
