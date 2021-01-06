package com.Developers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Developers.modelo.Voluntario;


@Repository
public interface VoluntarioRepository extends JpaRepository<Voluntario, Long>{

	

}
