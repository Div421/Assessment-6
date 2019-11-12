package com.example.studio.repo;

import java.util.List;

import com.example.studio.model.Album;


public interface AlbumDal {

	Album create(Album album);

	Boolean delete(Album album);

	List<Album> findAll();

	Album findById(String id);



}
