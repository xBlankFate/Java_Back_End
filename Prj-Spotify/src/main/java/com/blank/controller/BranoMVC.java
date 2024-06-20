package com.blank.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.blank.entities.Brano;
import com.blank.service.BranoService;

@Controller
public class BranoMVC {
	
	@Autowired
	BranoService serviceBrano;
	
	@GetMapping("homePageUser")
	public String getListaBrano(){
		serviceBrano.getListaBrani();
		return "homePageUser";
	}
	
	@PostMapping("homePageUser")
	public Brano addBrano(@RequestBody Brano b) {
		return serviceBrano.addBrano(b);
	}
	
}

