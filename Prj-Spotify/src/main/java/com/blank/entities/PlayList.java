package com.blank.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "PlayList")
public class PlayList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long playlist_id;
	private String nomePlaylist;
	
	@ManyToMany(mappedBy = "braniPlaylist")
	private Set<Brano> playlistBrani;
	
	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente;
	

	public String getNomePlaylist() {
		return nomePlaylist;
	}

	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}

	public long getId() {
		return playlist_id;
	}

	public void setId(long id) {
		this.playlist_id = id;
	}
	
	
	
	
}
