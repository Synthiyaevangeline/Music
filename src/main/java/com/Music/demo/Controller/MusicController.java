package com.Music.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Music.demo.Model.Music;
import com.Music.demo.Service.MusicService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class MusicController {
		@Autowired
		MusicService musicService;
		@Tag(name="Get Mapping For Music",description="Get All Music")
		@GetMapping("/Music")
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
		@PutMapping(value="/updateMusic/{no}")
		public Music updateMusic(@RequestBody Music m,@PathVariable("no") int no) 
		{
			return musicService.updateMusic(m,no);
		}
		@DeleteMapping(value="/deleteMusic/{no}")
		public void  deleteMusic(@PathVariable("no") int no)
		{
			musicService.deleteMusic(no);
		}
		@GetMapping(value="/getMusic/{no}")
		public Music getMusic(@PathVariable("no") int no)
		{
			return musicService.getMusic(no);
		}
		@GetMapping(value="/sortMusic/{songname}")
		public List<Music> sortMusic(@PathVariable("songname") String songname)
		{
			return musicService.sortMusic(songname);
		}
		@GetMapping(value="/paginate/{offset}/{pageSize}")
		public List<Music> paginate(@PathVariable("offset") int offset,@PathVariable("pageSize")int pageSize)
		{
			return musicService.paginate(offset,pageSize);
		}
		@GetMapping(value="/paginateAndSorting/{offset}/{pageSize}/{songname}")
		public List<Music> paginateAndSorting(@PathVariable("offset") int offset,@PathVariable("pageSize")int pageSize,@PathVariable("songname") String songname)
		{
			return musicService.paginateAndSorting(offset,pageSize,songname);
		}
		@GetMapping("/fetchPrefix")
		public List<Music> fetchPrefix(@RequestParam String prefix)
		{
			return musicService.fetchPrefix(prefix);
		}
		@GetMapping("/fetchSuffix")
		public List<Music> fetchSuffix(@RequestParam String suffix)
		{
			return musicService.fetchSuffix(suffix);
		}
		@GetMapping("/fetchByArtistname")
		public List<Music> fetchMusic(@RequestParam String artistname)
		{
			return musicService.fetchMusicByArtistnmae(artistname);
		}
		@DeleteMapping("/deleteMusicByName/{artistname}")
	    public String deleteMusicByName(@PathVariable String artistname)
	    {
	 	   int result = musicService.deleteMusicByName(artistname);
	 	   if(result>0)
	 		     return "Music record deleted";
	 	   else
	 		     return "Problem occured while deleting";
	    }
	    @PutMapping("/updateMusicByName/{songname}/{artistname}")
	    public String updateMusicByName(@PathVariable String songname,String artistname)
	    {
	 	   int res = musicService.updateMusicByName(songname, artistname);
	 	   if(res>0)
	 		      return "Music record updated";
	 	   else
	 		    return "Problem occured";
	    }
	    @GetMapping("/fetchMusicBySongName/{songname}")
	    public List<Music> fetchMusicByName(@PathVariable String songname)
	    {
	    	return musicService.fetchMusicByName(songname);
	    }
}

