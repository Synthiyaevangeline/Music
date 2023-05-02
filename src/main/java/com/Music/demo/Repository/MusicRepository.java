package com.Music.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Music.demo.Model.Music;
@Repository
public interface MusicRepository extends JpaRepository<Music,Integer>{
	List<Music> findByArtistnameStartingWith(String prefix);
	List<Music> findByArtistnameEndingWith(String suffix);
	List<Music> findByArtistname(String artistname);

}
