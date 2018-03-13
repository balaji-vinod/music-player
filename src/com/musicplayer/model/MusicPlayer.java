package com.musicplayer.model;

import java.util.ArrayList;
import java.util.List;

import com.musicplayer.contorls.Controls;
import com.musicplayer.factory.ControlFactory;
import com.musicplayer.state.PausePlay;
import com.musicplayer.state.VolumeLevel;
import com.musicplayer.state.impl.Pause;
import com.musicplayer.state.impl.VolumeLevel3;

public class MusicPlayer {
	
	private static MusicPlayer musicPlayer;
	private List<Track> tracks;
	private Controls controls;
	private VolumeLevel volumeLevel;
	private PausePlay pausePlay;
	private Integer currentTrack;
	
	private MusicPlayer(Integer currentTrack) {
		volumeLevel = VolumeLevel3.getInstance();
		pausePlay = Pause.getInstance();
		this.currentTrack = currentTrack;
		addTracks();
	}
	
	private void addTracks() {
		tracks = new ArrayList<>();
		tracks.add(new Track("1","1","1","1"));
		tracks.add(new Track("2","2","2","2"));
		tracks.add(new Track("3","3","3","3"));
		tracks.add(new Track("4","4","4","4"));
		tracks.add(new Track("5","5","5","5"));
	}

	public static MusicPlayer getInstance() {
		if(musicPlayer == null) {
			musicPlayer = new MusicPlayer(0);
		}
		return musicPlayer;
	}
	
	public void executeControl(String command) {
		Controls controls = ControlFactory.getControl(command);
		controls.execute();
	}

	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	public Controls getControls() {
		return controls;
	}
	public void setControls(Controls controls) {
		this.controls = controls;
	}

	public VolumeLevel getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(VolumeLevel volumeLevel) {
		this.volumeLevel = volumeLevel;
	}

	public Integer getCurrentTrack() {
		return currentTrack;
	}

	public void setCurrentTrack(Integer currentTrack) {
		this.currentTrack = currentTrack;
	}

	public PausePlay getPausePlay() {
		return pausePlay;
	}

	public void setPausePlay(PausePlay pausePlay) {
		this.pausePlay = pausePlay;
	}
	
	public void changeTrack(Integer trackNo) {
		musicPlayer.setCurrentTrack(trackNo);
		System.out.println(musicPlayer.getTracks().get(musicPlayer.getCurrentTrack()));
	}
	
}
