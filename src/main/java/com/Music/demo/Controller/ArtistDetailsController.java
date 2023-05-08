package com.Music.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Music.demo.Model.Artist;
import com.Music.demo.Service.ArtistDetailsService;

@RestController
public class ArtistDetailsController {
	@Autowired
	ArtistDetailsService asService;
	@GetMapping("/fetchAlldata")
	public List<Artist> fetchAllArtists()
	   {
		  return asService.fetchAllArtists();
	   }
	   @PostMapping("/saveAlldata")
	   public Artist saveArtists(@RequestBody Artist a)
	   {
		   return asService.saveArtists(a);
	   }

}
