package com.example.studio.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.studio.model.Album;
import com.example.studio.model.Artist;
import com.example.studio.model.Track;
import com.example.studio.repo.AlbumDal;
import com.example.studio.repo.ArtistDal;
import com.example.studio.repo.TrackDal;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class IndexController {
	
	@Autowired
	private TrackDal trackDal;
	
	@Autowired
	private AlbumDal albumDal;

	@Autowired
	private ArtistDal artistDal;

	
	@RequestMapping(value = "/tracks", method = RequestMethod.GET, produces = "application/json")
	public List<Track> firstPage() {
		return trackDal.findAll();
	}

	@DeleteMapping(path = { "/tracks/{id}" })
	public Track delete(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Track deletedtrack = trackDal.findById(id);
		System.out.println(deletedtrack);
		if(trackDal.delete(deletedtrack))
			return deletedtrack;
		else
			return null;
	}

	@PostMapping("/tracks")
	public Track create(@RequestBody Track user) {
		trackDal.create(user);
		System.out.println(user + " insert");
		return user;
	}
	
	@RequestMapping(value = "/albums", method = RequestMethod.GET, produces = "application/json")
	public List<Album> firstAlbumPage() {
		return albumDal.findAll();
	}

	@DeleteMapping(path = { "/albums/{id}" })
	public Album deleteAlbum(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Album deletedalbum = albumDal.findById(id);
		System.out.println(deletedalbum);
		if(albumDal.delete(deletedalbum))
			return deletedalbum;
		else
			return null;
	}

	@PostMapping("/albums")
	public Album create(@RequestBody Album user) {
		albumDal.create(user);
		System.out.println(user + " insert");
		return user;
	}
	
	@RequestMapping(value = "/artist", method = RequestMethod.GET, produces = "application/json")
	public List<Artist> firstArtistPage() {
		return artistDal.findAll();
	}

	@DeleteMapping(path = { "/artist/{id}" })
	public Artist deleteArtist(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Artist deletedartist = artistDal.findById(id);
		System.out.println(deletedartist);
		if(artistDal.delete(deletedartist))
			return deletedartist;
		else
			return null;
	}

	@PostMapping("/artist")
	public Artist createArtist(@RequestBody Artist user) {
		artistDal.create(user);
		System.out.println(user + " insert");
		return user;
	}
	


}
