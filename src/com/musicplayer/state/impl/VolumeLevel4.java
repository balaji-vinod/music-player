package com.musicplayer.state.impl;

import com.musicplayer.model.MusicPlayer;
import com.musicplayer.state.VolumeLevel;

public class VolumeLevel4 implements VolumeLevel {

	private static VolumeLevel4 volumeLevel4;
	
	private VolumeLevel4() {
	}
	
	public static VolumeLevel4 getInstance() {
		if(volumeLevel4 == null) {
			volumeLevel4 = new VolumeLevel4();
		}
		return volumeLevel4;
	}

	@Override
	public void volumeUp(MusicPlayer musicPlayer) {
		System.out.println("Volume at level 5");	
		musicPlayer.setVolumeLevel(VolumeLevel5.getInstance());
	}

	@Override
	public void volumeDown(MusicPlayer musicPlayer) {
		System.out.println("Volume at level 3");
		musicPlayer.setVolumeLevel(VolumeLevel3.getInstance());
	}

}
