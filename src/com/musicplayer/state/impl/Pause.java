package com.musicplayer.state.impl;

import com.musicplayer.model.MusicPlayer;
import com.musicplayer.state.PausePlay;

public class Pause implements PausePlay {

	private static Pause pause;
	
	private Pause() {
		
	}
	
	
	public static Pause getInstance() {
		if(pause == null) {
			pause = new Pause();
		}
		return pause;
	}
	
	@Override
	public void toggle(MusicPlayer musicPlayer) {
		musicPlayer.setPausePlay(Play.getInstance());
		System.out.println("Playing :"+musicPlayer.getTracks().get(musicPlayer.getCurrentTrack()));
	}

}
