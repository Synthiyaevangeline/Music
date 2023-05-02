package com.Music.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
		public Music updateMusic(Music m,int no)
		{
			Optional<Music> optional=musicRepository.findById(no);
			Music obj=null;
			if(optional.isPresent())
			{
				obj=optional.get();
				musicRepository.save(m);
			}
			return obj;
		}
		public void deleteMusic(int no)
		{
			musicRepository.deleteById(no);
		}
		public Music getMusic(int no)
		{
			Music m = musicRepository.findById(no).get();
			return m;
		}
		public List<Music> sortMusic(String songname)
		{
			return musicRepository.findAll(Sort.by(songname));
		}
		public List<Music> paginate(int offset,int pageSize)
		{
			Page<Music> obj=musicRepository.findAll(PageRequest.of(offset,pageSize));
			return obj.getContent();
		}
		public List<Music> paginateAndSorting(int offset,int pageSize,String songname)
		{
			Page<Music> obj=musicRepository.findAll(PageRequest.of(offset,pageSize,Sort.by(songname).ascending()));
			return obj.getContent();
		}
		public List<Music> fetchPrefix(String prefix) 
		{
			return musicRepository.findByArtistnameStartingWith(prefix);
			
		}
		public List<Music> fetchSuffix(String suffix) 
		{
			return musicRepository.findByArtistnameEndingWith(suffix);
			
		}
		public List<Music> fetchMusicByArtistnmae(String artistname)
		{
			return musicRepository.findByArtistname(artistname);
		}
		
	}

