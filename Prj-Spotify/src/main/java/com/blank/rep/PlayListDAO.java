package com.blank.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blank.entities.PlayList;

public interface PlayListDAO extends JpaRepository<PlayList, Integer> {

}
