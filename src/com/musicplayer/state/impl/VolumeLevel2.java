package com.musicplayer.state.impl;

import com.musicplayer.model.MusicPlayer;
import com.musicplayer.state.VolumeLevel;

public class VolumeLevel2 implements VolumeLevel {

	private static VolumeLevel2 volumeLevel2;
	
	private VolumeLevel2() {
	}
	
	public static VolumeLevel2 getInstance() {
		if(volumeLevel2 == null) {
			volumeLevel2 = new VolumeLevel2();
		}
		return volumeLevel2;
	}

	@Override
	public void volumeUp(MusicPlayer musicPlayer) {
		System.out.println("Volume at level 3");
		musicPlayer.setVolumeLevel(VolumeLevel3.getInstance());
	}

	@Override
	public void volumeDown(MusicPlayer musicPlayer) {
		System.out.println("Volume at level 1");
		musicPlayer.setVolumeLevel(VolumeLevel1.getInstance());
	}

}
