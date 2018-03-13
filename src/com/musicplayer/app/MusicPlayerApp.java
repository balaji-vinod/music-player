package com.musicplayer.app;

import java.util.Scanner;

import com.musicplayer.model.MusicPlayer;

public class MusicPlayerApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		MusicPlayer musicPlayer = MusicPlayer.getInstance();
		boolean exitFlag = false;
		String command = "";
		Scanner scanner = new Scanner(System.in);
		while(!exitFlag) {
			System.out.println("Choose music options\n"
					+ "1) Play/Pause\n"
					+ "2) Volume up\n"
					+ "3) Volume down\n"
					+ "4) Next track\n"
					+ "5) Previous track\n"
					+ "0) Exit");
			command = scanner.nextLine();
			switch(command) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
				musicPlayer.executeControl(command);
				break;
			case "0":
				exitFlag = true;
			}
		}
	}
}
