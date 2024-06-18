package com.momo.res;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.momo.entities.Paese;

public interface PaeseDAO extends JpaRepository<Paese, String> {
		
		//Derived query
		List<Paese> findByRegion(String regione); 
		
		@Query(value = "select distinct(region) as region from countries",nativeQuery = true)
		List<Paese> trovaRegioniDistinte(String regione);
		
		@Query(value = "select capital from countries",nativeQuery = true)
		List<Paese> trovaCapitali(String capitali);

		Paese findByCapital(String capital);
		
}
