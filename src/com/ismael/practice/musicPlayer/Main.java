package com.ismael.practice.musicPlayer;

public class Main {

	public static void main(String[] args) {
		
		Song song = new Song("thank you for recording", "Oklou", true);
		Podcast podcast = new Podcast("Billie Eilish’s FOH Engineer, Drew Thornton (Podcast Episode 6)", "Learn Live Music", false);
		
		User freeUser = new User("moonissharp", false);
		User vipUser = new User("ismajoventino", true);
		
		try {
			podcast.play(vipUser);
			podcast.play(freeUser);
			song.play(vipUser);
			song.play(freeUser);
		} catch (PremiumRequiredException e) {
			System.out.println("ERROR: " + e.getMessage());
		}

	}

}
