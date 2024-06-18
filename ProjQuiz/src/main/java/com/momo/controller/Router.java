package com.momo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Router {
	
	@GetMapping("quiz")
	String home() {
		return "quiz";
	
	}	 
 }
	

