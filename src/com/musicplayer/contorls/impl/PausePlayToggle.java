package com.musicplayer.contorls.impl;

import com.musicplayer.contorls.Controls;
import com.musicplayer.model.MusicPlayer;

public class PausePlayToggle implements Controls {

	private MusicPlayer musicPlayer;
	
	public PausePlayToggle() {
		musicPlayer = MusicPlayer.getInstance();
	}
	
	@Override
	public void execute() {
		musicPlayer.getPausePlay().toggle(musicPlayer);
	}

}
