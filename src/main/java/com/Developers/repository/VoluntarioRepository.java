package com.Developers.repository;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Developers.modelo.Socio;
import com.Developers.modelo.Voluntario;


@Repository
public interface VoluntarioRepository extends JpaRepository<Voluntario, Long>{
	
	List<Socio> findByApellidos(String apellidos);
	List<Socio> findByTipoDeVoluntario(String tipoDeVoluntario);
	

}
