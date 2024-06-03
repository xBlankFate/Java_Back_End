package com.blank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blank.entities.SerieTv;
import com.blank.services.SerieService;

@RestController
@RequestMapping("api")
public class SerieREST {
	
	@Autowired
	private SerieService service;
	
	@GetMapping("serie")
	public List<SerieTv> getAllSerieTv(){
		return service.getSerie();
	}
	@PostMapping("serie")
	public SerieTv addSerie(@RequestBody SerieTv s) {
		
		return service.addSerieTv(s);
		
	}
	
}
