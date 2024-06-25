package com.blank.rep;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blank.entities.PlayList;

public interface PlayListDAO extends JpaRepository<PlayList, Integer> {

	PlayList getById(Integer playlist_id);
	
}
