package com.example.studio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Artist {

	@Id
	private String id;
	private String name;
	@DBRef
	private List<Album> albums;
	public Artist(String id, String name, List<Album> albums) {
		super();
		this.id = id;
		this.name = name;
		this.albums = albums;
	}
	public Artist() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Album> getAlbums() {
		return albums;
	}
	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	
	
}
