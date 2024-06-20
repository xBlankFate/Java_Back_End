package com.blank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blank.entities.PlayList;
import com.blank.service.PlayListService;

@RestController
@RequestMapping("api")
public class PlayListRest {
	
	@Autowired
	PlayListService service;
	
	@GetMapping("/tuttePlaylist")
	public List<PlayList> getListaPlayList(@RequestBody PlayList p){
		return service.getListaPlayList();
	}
	
	@PostMapping("/tuttePlaylist")
	public PlayList addUnaPlayList(@RequestBody PlayList p) {
		return service.addPlayList(p);
	}
	
	@GetMapping("/playlist/perNome")
	public PlayList getPlayListByNome(@RequestBody PlayList p) {
		return service.getPlayListByNome(p);
	}
	
	@DeleteMapping("/tuttePlaylist")
	public void deleteUnaPlaylist(@RequestBody PlayList p) {
		 service.deletePlayList(p);
	}
	
}
