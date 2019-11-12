package com.example.studio.repo;

import java.util.List;

import com.example.studio.model.Track;

public interface TrackDal {

	Track create(Track track);

	Boolean delete(Track track);

	List<Track> findAll();

	Track findById(String id);

}
