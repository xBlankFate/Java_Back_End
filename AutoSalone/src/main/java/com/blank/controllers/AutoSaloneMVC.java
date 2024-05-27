package com.blank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.blank.entitys.AutoMobile;
import com.blank.services.AutoSaloneService;

@Controller
public class AutoSaloneMVC {
	
	@Autowired
	private AutoSaloneService service;
	
	@GetMapping("")
	public String home() {
		
		return "index";
		
	}
	
	@GetMapping("cars")
	public String getAutoMobili(Model m) {
		
		m.addAttribute("titolo","la mia pagina Web");
		m.addAttribute("cars",service.getAutoMobili());
		
		return "elenco";
		
	}
	
	@PostMapping("cars")
	public String addAuto(AutoMobile a) {
		
		service.addAutoMobile(a);
		
		return "redirect:cars";
		
	}

}
