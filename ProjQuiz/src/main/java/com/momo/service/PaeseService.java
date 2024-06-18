package com.momo.service;

import java.util.List;

import com.momo.entities.Paese;

public interface PaeseService {
	
	
	List<Paese> getPaesi();
	List<Paese> getPaesiByRegion(String region);
	
	Paese getPaeseByCapital(String capital);
	Paese getPaeseByName(String name);
	

}
