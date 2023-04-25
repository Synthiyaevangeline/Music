package com.Music.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Music.demo.Model.Music;
import com.Music.demo.Repository.MusicRepository;

@Service
public class MusicService {
		@Autowired
		MusicRepository musicRepository;
		public List<Music> getAllMusic()
		{	
			List<Music> musicList = musicRepository.findAll();
			return musicList;
		}
		public Music saveMusic(Music m)
		{
		return musicRepository.save(m);
		
		}
		public Music updateMusic(Music m)
		{
			Music obj = musicRepository.saveAndFlush(m);
			return obj;
		}
		public void deleteMusic(int no)
		{
			musicRepository.deleteById(no);
		}
		
	}



