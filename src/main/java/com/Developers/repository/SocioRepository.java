package com.Developers.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Developers.modelo.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Long>{
	
;
}
