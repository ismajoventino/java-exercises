package com.ismael.practice.musicPlayer;

public class Podcast implements Playable{

	private String title;
	private String host;
	private boolean isPremium;
	
	public Podcast(String title, String host, boolean isPremium) {
		this.title = title;
		this.host = host;
		this.isPremium = isPremium;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
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
		
		System.out.println("NOW PLAYING: " + this.title + " - " + this.host);
		
	}
	
}
