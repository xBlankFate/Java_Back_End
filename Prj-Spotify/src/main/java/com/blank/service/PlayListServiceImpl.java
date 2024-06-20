package com.blank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blank.entities.PlayList;
import com.blank.rep.PlayListDAO;

@Service
public class PlayListServiceImpl implements PlayListService{
	
	@Autowired
	PlayListDAO dao;
	
	@Override
	public List<PlayList> getListaPlayList() {
		return dao.findAll();
	}

	public PlayList getPlayListById(int id) {
		return dao.getReferenceById(id);
	}

	@Override
	public PlayList addPlayList(PlayList p) {
		return dao.save(p);
	}

	@Override
	public void deletePlayList(PlayList p) {
		dao.delete(p);
	}

	@Override
	public PlayList getPlayListByNome(PlayList p) {
		// TODO Auto-generated method stub
		return null;
	}

}
