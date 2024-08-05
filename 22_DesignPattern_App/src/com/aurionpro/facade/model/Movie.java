package com.aurionpro.facade.model;

public class Movie {
	
	public void turnOn() {
		DVDPlayer player = new DVDPlayer();
		
		System.out.println("Dvd player started");
		player.setStart(true);
		System.out.println("Dvd players starts");
		
		
		SoundSystem system = new SoundSystem();
		system.setStart(true);
		System.out.println("sound system on");
		
		Projector projector = new Projector();
		projector.setOn(true);
		System.out.println("projector on");
		
	}
	
	public void turnOff() {
		DVDPlayer player = new DVDPlayer();
		

		player.setStart(false);
		System.out.println("Dvd player stopped");
		
		
		SoundSystem system = new SoundSystem();
		system.setStart(false);
		System.out.println("sound system turned off");
		
		Projector projector = new Projector();
		projector.setOn(false);
		System.out.println("projector turned off");
		
	}

}
