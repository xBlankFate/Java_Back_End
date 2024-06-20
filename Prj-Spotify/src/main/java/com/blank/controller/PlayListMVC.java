package com.blank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.blank.entities.PlayList;
import com.blank.service.PlayListService;

@Controller
public class PlayListMVC {
	
	@Autowired
	PlayListService serviceP;
	
	@PostMapping("/tuttePlaylist")
	public List<PlayList> getListaPlaylist(@RequestBody PlayList p){
		return serviceP.getListaPlayList();
	}
	
	@PostMapping("homePage")
	public String addPlayListDB(@RequestBody PlayList p) {
		serviceP.addPlayList(p);
		return "homePage";
	}
	
	@DeleteMapping("homePage")
	public String deletePlayListDB(@RequestBody PlayList p) {
		serviceP.deletePlayList(p);
		return("homePage");
	}
	
}
