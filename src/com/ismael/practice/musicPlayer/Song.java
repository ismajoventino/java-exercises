package com.ismael.practice.musicPlayer;

public class Song implements Playable{

	private String title;
	private String artist;
	private boolean isPremium;
	
	public Song(String title, String artist, boolean isPremium) {
		this.title = title;
		this.artist = artist;
		this.isPremium = isPremium;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	@Override
	public void play(User user) throws PremiumRequiredException {
		if(isPremium && !user.isVip()) {
			throw new PremiumRequiredException("Access Denied: You need a premium account to play " + this.title);
		} 
		
		System.out.println("NOW PLAYING: " + this.title + " - " + this.artist);
		
	}
	
}
