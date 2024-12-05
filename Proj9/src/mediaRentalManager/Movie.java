package mediaRentalManager;

public class Movie implements Media, Comparable<Media> {
	private String title;
	public int copiesAvailable;
	private String rating;
	
	public Movie(String title, int copiesAvailable, String rating) {
		this.title = title;
		this.copiesAvailable = copiesAvailable;
		this.rating = rating;
	}
	
	public String getTitle() {
		return title;
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
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public int compareTo(Media other) {
		return this.getTitle().compareTo(other.getTitle());
	}
	
	public String toString() {
		return "Title: " + title + ", Copies Available: " + copiesAvailable
				+ ", Rating: " + rating;
	}
}
