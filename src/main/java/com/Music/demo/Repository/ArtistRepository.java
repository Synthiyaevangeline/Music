package com.Music.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Music.demo.Model.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Long> {

}
