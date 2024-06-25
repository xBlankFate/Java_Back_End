package com.blank.service;

import java.util.List;

import com.blank.entities.Brano;

public interface BranoService {
	
	List<Brano> getListaBrani();
	Brano getlistaById(Integer brano_id);
	String getBranoByTitolo(String titolo);
	Brano addBrano(Brano b);
	
}