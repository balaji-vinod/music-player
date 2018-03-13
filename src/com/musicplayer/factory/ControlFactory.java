package com.musicplayer.factory;

import com.musicplayer.contorls.Controls;
import com.musicplayer.contorls.impl.NextTrack;
import com.musicplayer.contorls.impl.PausePlayToggle;
import com.musicplayer.contorls.impl.PreviousTrack;
import com.musicplayer.contorls.impl.VolumeDown;
import com.musicplayer.contorls.impl.VolumeUp;

public class ControlFactory {
	
	public static Controls getControl(String command) {
		Controls controls = null;
		switch(command) {
		case "1":
			controls = new PausePlayToggle();
			break;
		case "2":
			controls = new VolumeUp();
			break;
		case "3":
			controls = new VolumeDown();
			break;
		case "4":
			controls = new NextTrack();
			break;
		case "5":
			controls = new PreviousTrack();
			break;
		}
		return controls;
	}

}
