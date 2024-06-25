package com.blank.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "brani")
public class Brano {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int brano_id;
	private String titolo;
	private String artista;
	private String album;
	private double durata;
	private String genere;
	
	@ManyToMany
	@JoinTable(
			
	name = "braniPlaylist",
	joinColumns = @JoinColumn(name = "playlist_id"),
	inverseJoinColumns = @JoinColumn(name="brano_id"))
	private Set<PlayList> braniPlaylist;
	
	
	
	public int getId() {
		return brano_id;
	}
	public void setId(int id) {
		this.brano_id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public double getDurata() {
		return durata;
	}
	public void setDurata(double durata) {
		this.durata = durata;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
}
