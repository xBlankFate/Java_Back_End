package com.blank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blank.entitys.AutoMobile;
import com.blank.services.AutoSaloneService;

@RestController
@RequestMapping("api")
public class AutoSaloneRest {
	
	@Autowired
	private AutoSaloneService service;
	
	@GetMapping("cars")
	List<AutoMobile> getAutoMobili(){
		
		return service.getAutoMobili();
	}

	@PostMapping("cars")
	AutoMobile addAuto(@RequestBody AutoMobile a) {

		return service.addAutoMobile(a);
		
	}
}
