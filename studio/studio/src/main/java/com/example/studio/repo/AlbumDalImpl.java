package com.example.studio.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.studio.model.Album;




@Repository
public class AlbumDalImpl implements AlbumDal{

	@Autowired
	private MongoTemplate mongo;

	@Override
	public Album create(Album album) {
		// TODO Auto-generated method stub
		return mongo.save(album);
	}

	@Override
	public Boolean delete(Album album) {
		// TODO Auto-generated method stub
		return mongo.remove(album).wasAcknowledged();
	}

	@Override
	public List<Album> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Album.class);
	}

	@Override
	public Album findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Album.class);
	}
}
