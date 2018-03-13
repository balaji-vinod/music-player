package com.musicplayer.state.impl;

import com.musicplayer.model.MusicPlayer;
import com.musicplayer.state.VolumeLevel;

public class VolumeLevel3 implements VolumeLevel {

	private static VolumeLevel3 volumeLevel3;
	
	private VolumeLevel3() {
	}
	
	public static VolumeLevel3 getInstance() {
		if(volumeLevel3 == null) {
			volumeLevel3 = new VolumeLevel3();
		}
		return volumeLevel3;
	}

	@Override
	public void volumeUp(MusicPlayer musicPlayer) {
		System.out.println("Volume at level 4");
		musicPlayer.setVolumeLevel(VolumeLevel4.getInstance());
	}

	@Override
	public void volumeDown(MusicPlayer musicPlayer) {
		System.out.println("Volume at level 2");
		musicPlayer.setVolumeLevel(VolumeLevel2.getInstance());
	}

}
