package com.blank.services;

import java.util.List;

import com.blank.entities.SerieTv;

public interface SerieService {
	
	List<SerieTv> getSerie();
	SerieTv getSerieById(int id);
	SerieTv addSerieTv(SerieTv s);
}
