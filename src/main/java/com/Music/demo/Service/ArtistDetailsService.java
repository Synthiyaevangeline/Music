package com.Music.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Music.demo.Model.Artist;
import com.Music.demo.Repository.ArtistRepository;

@Service
public class ArtistDetailsService {
	@Autowired
	ArtistRepository artistRepository;
	public List<Artist>fetchAllArtists()
	   {
		   return artistRepository.findAll();
	   }
     public Artist saveArtists(Artist a)
	   {
		   return artistRepository.save(a);
	   }

}
