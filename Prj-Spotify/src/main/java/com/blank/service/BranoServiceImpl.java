package com.blank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blank.entities.Brano;
import com.blank.rep.BranoDAO;

@Service
public class BranoServiceImpl implements BranoService {
	
	@Autowired
	BranoDAO daoBrano;

	@Override
	public List<Brano> getListaBrani() {
		return daoBrano.findAll();
	}

}

