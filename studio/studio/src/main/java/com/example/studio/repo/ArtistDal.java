package com.example.studio.repo;

import java.util.List;

import com.example.studio.model.Artist;

public interface ArtistDal {

	Artist create(Artist artist);

	Boolean delete(Artist artist);

	List<Artist> findAll();

	Artist findById(String id);




}
