package com.musicplayer.contorls.impl;

import com.musicplayer.contorls.Controls;
import com.musicplayer.model.MusicPlayer;
import com.musicplayer.state.impl.VolumeLevel3;

public class VolumeDefault implements Controls {
	
	private MusicPlayer musicPlayer;
	
	public VolumeDefault() {
		musicPlayer = MusicPlayer.getInstance();
	}

	@Override
	public void execute() {
		musicPlayer.setVolumeLevel(VolumeLevel3.getInstance());
	}

}
