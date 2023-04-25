package com.Music.demo.Model;

import jakarta.persistence.Column;
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
	
	public String getFollowers() {
		return followers;
	}
	public void setFollowers(String followers) {
		this.followers = followers;
	}
	public String getNoofShares() {
		return noofshares;
	}
	public void setNoofShares(String noofShares) {
		this.noofshares = noofShares;
	}
	
	
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
	

}
