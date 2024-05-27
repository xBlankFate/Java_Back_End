package com.blank.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blank.entitys.AutoMobile;

@Repository
public interface AutoMobileDAO extends JpaRepository<AutoMobile, Long> {

	
	
}
