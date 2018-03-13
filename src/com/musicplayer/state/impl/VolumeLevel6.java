package com.musicplayer.state.impl;

import com.musicplayer.model.MusicPlayer;
import com.musicplayer.state.VolumeLevel;

public class VolumeLevel6 implements VolumeLevel {

	private static VolumeLevel6 volumeLevel6;
	
	private VolumeLevel6() {
	}
	
	public static VolumeLevel6 getInstance() {
		if(volumeLevel6 == null) {
			volumeLevel6 = new VolumeLevel6();
		}
		return volumeLevel6;
	}

	@Override
	public void volumeUp(MusicPlayer musicPlayer) {
		System.out.println("Volumed Maxed out");
	}

	@Override
	public void volumeDown(MusicPlayer musicPlayer) {
		System.out.println("Volume at level 5");
		musicPlayer.setVolumeLevel(VolumeLevel5.getInstance());
	}

}
