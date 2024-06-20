package com.blank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	
}

