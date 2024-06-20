package com.blank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blank.entities.Brano;
import com.blank.service.BranoService;

@RestController
@RequestMapping("api")
public class BranoRest {
	
	@Autowired
	BranoService serviceBrano;
	
	@GetMapping("homePageUser")
	public List<Brano> getListaBrano(){
		return serviceBrano.getListaBrani();
	}
	
	
	

}