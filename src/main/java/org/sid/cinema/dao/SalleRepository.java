package org.sid.cinema.dao;



import java.util.List;

import org.sid.cinema.entities.Salle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface SalleRepository extends JpaRepository<Salle, Long >{
	
	
	
	//@Query("SELECT s FROM Salle s,Cinema c WHERE s.cinema.id =:id")
    //public List<Salle> findByCinemaId(@Param("id") Long id);
}
