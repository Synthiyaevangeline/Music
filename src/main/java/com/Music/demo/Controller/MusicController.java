package com.Music.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Music.demo.Model.Music;
import com.Music.demo.Service.MusicService;

@RestController
public class MusicController {
		@Autowired
		MusicService musicService;
		@GetMapping("/music")
		public List<Music> getAllMusics()
		{
			List<Music> musicList = musicService.getAllMusic();
			return musicList;
		}
		//http://localhost:8080/saveMusic
		@PostMapping(value="/saveMusic")
		public Music saveMusic(@RequestBody Music m) 
		{
			return musicService.saveMusic(m);
		}
		@PutMapping(value="/updateMusic")
		public Music updateMusic(@RequestBody Music m) 
		{
			return musicService.saveMusic(m);
		}
		@DeleteMapping(value="/deleteMusic/{no}")
		public void  deleteMusic(@PathVariable("no") int no)
		{
			musicService.deleteMusic(no);
		}
}

