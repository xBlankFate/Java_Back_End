package com.blank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blank.entities.SerieTv;
import com.blank.repos.SerieDAO;

@Service
public class SerieServImp implements SerieService {
	
	@Autowired
	private SerieDAO dao;
	
	@Override
	public List<SerieTv> getSerie() {

		return dao.findAll();
	
	}
	
	@Override
	public SerieTv getSerieById(int id) {

		return dao.getReferenceById(id);
	
	}

	@Override
	public SerieTv addSerieTv(SerieTv s) {

		return dao.save(s);
	
	}

}
