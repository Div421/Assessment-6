package com.example.studio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Album {
	
	@Id
	private String id;
	private String name;
	@DBRef
	private List<Track> tracks;
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
	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	public Album(String id, String name, List<Track> tracks) {
		super();
		this.id = id;
		this.name = name;
		this.tracks = tracks;
	}
	public Album() {
		super();
	}
	

}
