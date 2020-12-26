package com.Developers.repository;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Developers.modelo.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Long>{
	
	List<Socio> findByApellidos(String apellidos);
	List<Socio> findByTipoCuota(String tipoCuota);
	//public void guardar(Socio socio);
	
	//@Query("SELECT coalesce(max(s.id),0)FROM socio s") Long getMaxId();
}
