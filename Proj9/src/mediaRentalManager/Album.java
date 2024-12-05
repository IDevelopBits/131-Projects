package mediaRentalManager;

public class Album implements Media, Comparable<Media>{
	private String title;
	private int copiesAvailable;
	private String artist;
	private String songs;

	public Album(String title, int copiesAvailable, String artist, String songs) {
		this.title = title;
		this.copiesAvailable = copiesAvailable;
		this.artist = artist;
		this.songs = songs;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;	
	}

	public int getCopiesAvailable() {
		return copiesAvailable;
	}

	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongs() {
		return songs;
	}

	public void setSongs(String songs) {
		this.songs = songs;
	}
	
	public int compareTo(Media other) {
		return this.getTitle().compareTo(other.getTitle());
	}
	
	public String toString() {
		return "Title: " + title + ", Copies Available: " + copiesAvailable
				+ ", Artist: " + artist + ", Songs: " + songs;
	}

}
