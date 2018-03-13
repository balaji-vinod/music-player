package com.musicplayer.state.impl;

import com.musicplayer.model.MusicPlayer;
import com.musicplayer.state.VolumeLevel;

public class Mute implements VolumeLevel {
	
	private static Mute mute;
	
	private Mute() {
		
	}
	
	
	public static Mute getInstance() {
		if(mute == null) {
			mute = new Mute();
		}
		return mute;
	}

	@Override
	public void volumeUp(MusicPlayer musicPlayer) {
		System.out.println("Volume at level 1");
		musicPlayer.setVolumeLevel(VolumeLevel1.getInstance());
	}

	@Override
	public void volumeDown(MusicPlayer musicPlayer) {
		System.out.println("Already muted");
	}

}
