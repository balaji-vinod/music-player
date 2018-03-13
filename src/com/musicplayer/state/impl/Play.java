package com.musicplayer.state.impl;

import com.musicplayer.model.MusicPlayer;
import com.musicplayer.state.PausePlay;

public class Play implements PausePlay {

	private static Play play;
	
	private Play() {
		
	}
	
	public static Play getInstance() {
		if(play == null) {
			play = new Play();
		}
		return play;
	}
	
	@Override
	public void toggle(MusicPlayer musicPlayer) {
		musicPlayer.setPausePlay(Pause.getInstance());
		System.out.println("Paused");
	}

}
