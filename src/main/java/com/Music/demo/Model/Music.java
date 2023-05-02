package com.Music.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="music")
public class Music {
	
	@Id
	private int no;
	private String songname;
	private String artistname;
	private String noofplays;
	private String noofshares;
	private String followers;
	private String likes;
	private String genre;
	private String nationality;
	private String noofsongs;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getArtistname() {
		return artistname;
	}
	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}
	public String getNoofplays() {
		return noofplays;
	}
	public void setNoofplays(String noofplays) {
		this.noofplays = noofplays;
	}
	public String getNoofshares() {
		return noofshares;
	}
	public void setNoofshares(String noofshares) {
		this.noofshares = noofshares;
	}
	public String getFollowers() {
		return followers;
	}
	public void setFollowers(String followers) {
		this.followers = followers;
	}
	public String getLikes() {
		return likes;
	}
	public void setLikes(String likes) {
		this.likes = likes;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getNoofsongs() {
		return noofsongs;
	}
	public void setNoofsongs(String noofsongs) {
		this.noofsongs = noofsongs;
	}
	
	
}