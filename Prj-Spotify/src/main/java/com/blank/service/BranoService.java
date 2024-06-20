package com.blank.service;

import java.util.List;

import com.blank.entities.Brano;

public interface BranoService {
	
	List<Brano> getListaBrani();
	String getlistaByArtista(String artista);
	String getBranoByTitolo(String titolo);
	Brano addBrano(Brano b);
	
}