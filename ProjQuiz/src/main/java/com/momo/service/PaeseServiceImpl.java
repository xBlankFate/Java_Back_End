package com.momo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.momo.entities.Paese;
import com.momo.res.PaeseDAO;

@Service
public class PaeseServiceImpl implements PaeseService {
	
	@Autowired
	private PaeseDAO dao;

	@Override
	public List<Paese> getPaesi() {
		return dao.findAll();
	}

	@Override
	public List<Paese> getPaesiByRegion(String region) {
		return dao.findByRegion(region);
	}

	@Override
	public Paese getPaeseByCapital(String capital) {
		return (Paese) dao.findByCapital(capital);
	}

	@Override
	public Paese getPaeseByName(String name) {
		return null;
	}
	
}
