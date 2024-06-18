package com.momo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.entities.Paese;
import com.momo.service.PaeseService;

@RestController
@RequestMapping("api")
public class QuizREST {
	
	@Autowired
	private PaeseService service;
	
	//Questo nome puo essere qualsiasi, è diverso da quello del service
	@GetMapping("paesi")
	List<Paese> getPaesi(){
		return service.getPaesi();
	}
	
	@GetMapping("paesi/{region}")
	List<Paese> getPaesi(@PathVariable String region){
		return service.getPaesiByRegion(region);
	}
	
	@GetMapping("regioni")
	List<String> getRegioni(){
		return service
				.getPaesi()
				.stream()
				.map(r -> r.getRegion())
				.distinct()
				.sorted()
				.toList()
				;
	}
	
	@GetMapping("capitali")
	List<String> getCapitali(){
		
		return service
				.getPaesi()
				.stream()
				.map(r -> r.getCapital())
				.distinct()
				.sorted()
				.toList()
				;
		
	}
	
	@GetMapping("stati")
	List<String> getStati(){
		
		return service
				.getPaesi()
				.stream()
				.map(r -> r.getName())
				.distinct()
				.sorted()
				.toList()
				;
		
	}
	
	
	
	
	//DEVI 
}
