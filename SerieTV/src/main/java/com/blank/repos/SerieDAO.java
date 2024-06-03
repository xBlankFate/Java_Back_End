package com.blank.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blank.entities.SerieTv;

@Repository
public interface SerieDAO extends JpaRepository<SerieTv, Integer> {

}
