package com.musicplayer.state.impl;

import com.musicplayer.model.MusicPlayer;
import com.musicplayer.state.VolumeLevel;

public class VolumeLevel5 implements VolumeLevel {

	private static VolumeLevel5 volumeLevel5;
	
	private VolumeLevel5() {
	}
	
	public static VolumeLevel5 getInstance() {
		if(volumeLevel5 == null) {
			volumeLevel5 = new VolumeLevel5();
		}
		return volumeLevel5;
	}

	@Override
	public void volumeUp(MusicPlayer musicPlayer) {
		System.out.println("Volume at level 6");
		musicPlayer.setVolumeLevel(VolumeLevel6.getInstance());
	}

	@Override
	public void volumeDown(MusicPlayer musicPlayer) {
		System.out.println("Volume at level 4");
		musicPlayer.setVolumeLevel(VolumeLevel4.getInstance());
	}

}
