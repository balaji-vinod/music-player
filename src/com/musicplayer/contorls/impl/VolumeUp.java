package com.musicplayer.contorls.impl;

import com.musicplayer.contorls.Controls;
import com.musicplayer.model.MusicPlayer;

public class VolumeUp implements Controls{
	
	private MusicPlayer musicPlayer;
	
	public VolumeUp() {
		musicPlayer = MusicPlayer.getInstance();
	}

	@Override
	public void execute() {
		musicPlayer.getVolumeLevel().volumeUp(musicPlayer);
	}

}
