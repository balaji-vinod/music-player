package com.musicplayer.state.impl;

import com.musicplayer.model.MusicPlayer;
import com.musicplayer.state.VolumeLevel;

public class VolumeLevel1 implements VolumeLevel {
	
	private static VolumeLevel1 volumeLevel1;
	
	private VolumeLevel1() {
	}
	
	public static VolumeLevel1 getInstance() {
		if(volumeLevel1 == null) {
			volumeLevel1 = new VolumeLevel1();
		}
		return volumeLevel1;
	}

	@Override
	public void volumeUp(MusicPlayer musicPlayer) {
		System.out.println("Volume at level 2");
		musicPlayer.setVolumeLevel(VolumeLevel2.getInstance());
	}

	@Override
	public void volumeDown(MusicPlayer musicPlayer) {
		System.out.println("System muted");
		musicPlayer.setVolumeLevel(Mute.getInstance());
	}

}
