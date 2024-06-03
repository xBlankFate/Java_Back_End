package com.blank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.blank.entities.SerieTv;
import com.blank.services.SerieService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class SerieMVC {
	
	@Autowired
	private SerieService service;
	
	@PostMapping("serie")
	public String addSerie(SerieTv s) {
		//TODO: process POST request
		service.addSerieTv(s);
		return "redirect:client.html";
	}
	
	
}
