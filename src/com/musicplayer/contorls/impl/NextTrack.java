package com.musicplayer.contorls.impl;

import com.musicplayer.contorls.Controls;
import com.musicplayer.model.MusicPlayer;

public class NextTrack implements Controls {
	
	private MusicPlayer musicPlayer;
	
	public NextTrack() {
		musicPlayer = MusicPlayer.getInstance();
	}
	
	@Override
	public void execute() {
		Integer nextTrack = musicPlayer.getCurrentTrack() + 1;
		if(musicPlayer.getTracks().size() <= nextTrack ) {
			System.out.println("End of tracks");
		} else {
			musicPlayer.changeTrack(nextTrack);
		}
	}

}
