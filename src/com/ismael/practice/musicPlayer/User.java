package com.ismael.practice.musicPlayer;

public class User {
	
	private String name;
	private boolean isVip;
	
	public User(String name, boolean isVip) {
		this.name = name;
		this.isVip = isVip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVip() {
		return isVip;
	}

	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}
	

}
