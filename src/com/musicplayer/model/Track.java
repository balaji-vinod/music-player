package com.musicplayer.model;

public class Track {

	private String albumName;
	private String trackName;
	private String movieName;
	private String singer;

	public Track() {
		super();
	}

	public Track(String albumName, String trackName, String movieName, String singer) {
		super();
		this.albumName = albumName;
		this.trackName = trackName;
		this.movieName = movieName;
		this.singer = singer;
	}

	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return albumName+" - "+trackName+" - "+movieName+" - "+singer;
	}
}
