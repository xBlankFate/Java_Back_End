package com.blank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blank.entities.Brano;
import com.blank.rep.BranoDAO;

@Service
public  class BranoServiceImpl implements BranoService {
	
	@Autowired
	BranoDAO daoBrano;

	@Override
	public List<Brano> getListaBrani() {
		// TODO Auto-generated method stub
		return daoBrano.findAll();
	}


	@Override
	public Brano addBrano(Brano b) {
		// TODO Auto-generated method stub
		return daoBrano.save(b);
	}


	@Override
	public Brano getlistaById(Integer brano_id) {
		// TODO Auto-generated method stub
		return daoBrano.getReferenceById(brano_id);
	}


	@Override
	public String getBranoByTitolo(String titolo) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
