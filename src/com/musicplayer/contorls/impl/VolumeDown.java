package com.musicplayer.contorls.impl;

import com.musicplayer.contorls.Controls;
import com.musicplayer.model.MusicPlayer;

public class VolumeDown implements Controls {

	private MusicPlayer musicPlayer;
	
	public VolumeDown() {
		musicPlayer = MusicPlayer.getInstance();
	}

	@Override
	public void execute() {
		musicPlayer.getVolumeLevel().volumeDown(musicPlayer);
	}

}
