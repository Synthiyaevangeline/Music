package com.Music.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Music.demo.Model.Music;

@Repository
public interface MusicRepository extends JpaRepository<Music,Integer>{

}
