package com.blank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blank.entities.PlayList;

@Service
public interface PlayListService {

	List<PlayList> getListaPlayList();
	PlayList getPlayListByNome(PlayList p);
	PlayList addPlayList(PlayList p);
	void deletePlayList(PlayList p);
	Optional<PlayList> getById(Integer id);
	
}
