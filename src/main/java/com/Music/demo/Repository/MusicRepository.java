package com.Music.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Music.demo.Model.Music;
@Repository
public interface MusicRepository extends JpaRepository<Music,Integer>{
	List<Music> findByArtistnameStartingWith(String prefix);
	List<Music> findByArtistnameEndingWith(String suffix);
	List<Music> findByArtistname(String artistname);
	//positional parameter,order should match
		@Query("select m from Music m where m.songname=?1 and m.artistname=?2")
	     public List<Music> getMusicByName(String songname,String artistname);
	    //named parameter
	    @Query("select m from Music m where m.songname=:songname")
	    public List<Music> getMusicByName(String songname);
		//DML
		@Modifying
		@Query("delete from Music m where m.artistname=?1")
		public int deleteMusicByName(String artistname);
	    @Modifying
	    @Query("update Music m set m.songname=?1 where m.artistname=?2")
	    public int updateMusicByName(String songname,String artistname);
	    @Query(value="select * from Music m where m.songname=?",nativeQuery=true)
        public List<Music> fetchMusicByName(String songname);


}
