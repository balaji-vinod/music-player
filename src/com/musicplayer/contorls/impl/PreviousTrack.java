package com.musicplayer.contorls.impl;

import com.musicplayer.contorls.Controls;
import com.musicplayer.model.MusicPlayer;

public class PreviousTrack implements Controls {

	private MusicPlayer musicPlayer;
	
	public PreviousTrack() {
		musicPlayer = MusicPlayer.getInstance();
	}
	
	@Override
	public void execute() {
		Integer previousTrack = musicPlayer.getCurrentTrack() - 1;
		if( previousTrack <= -1) {
			System.out.println("End of tracks");
		} else {
			musicPlayer.changeTrack(previousTrack);
		}
	}

}
