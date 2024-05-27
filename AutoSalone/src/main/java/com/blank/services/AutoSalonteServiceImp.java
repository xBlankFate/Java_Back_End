package com.blank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blank.entitys.AutoMobile;
import com.blank.repos.AutoMobileDAO;

@Service
public class AutoSalonteServiceImp implements AutoSaloneService {

	@Autowired
	private AutoMobileDAO dao;
	
	@Override
	public List<AutoMobile> getAutoMobili() {
		
		return dao.findAll();
	}

	@Override
	public List<AutoMobile> getAutoMobiliByMarca(String marca) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AutoMobile> getAutoMobiliByPrezzo(double prezzoMin, double prezzoMax) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AutoMobile getAutoMobileById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AutoMobile addAutoMobile(AutoMobile a) {
		
		return dao.save(a);
	}

	@Override
	public AutoMobile updateAutoMobile(AutoMobile a) {
		
		return dao.save(a);
	}

	@Override
	public void deleteAutoMobile(AutoMobile a) {
		
		dao.delete(a);
	}

}
