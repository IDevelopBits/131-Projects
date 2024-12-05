package mediaRentalManager;

import java.util.ArrayList;

public class MediaRentalManager implements MediaRentalManagerInt {
	private ArrayList<Media> mediaList = new ArrayList<>();
	private ArrayList<Customer> customerList = new ArrayList<>();
	private int limitedPlanLimit = 2;
	
	public void addCustomer(String name, String address, String plan) {
		Customer customer = new Customer(name, address, plan);
		customerList.add(customer);
	}

	public void addMovie(String title, int copiesAvailable, String rating) {
		Movie movie = new Movie(title, copiesAvailable, rating);
		mediaList.add(movie);
	}

	public void addAlbum(String title, int copiesAvailable, String artist, String songs) {
		Album album = new Album(title, copiesAvailable, artist, songs);
		mediaList.add(album);
		
	}

	public void setLimitedPlanLimit(int value) {	
		limitedPlanLimit = value;
	}

	public String getAllCustomersInfo() {
		String list = "***** Customers' Information *****\n";
		customerList.sort(null);
		
		for (Customer c : customerList) {
			list += c + "\n";
		}
		return list;
	}

	public String getAllMediaInfo() {
		String list = "***** Media Information *****\n";
		mediaList.sort(null);
		
		for (Media m : mediaList) {
			list += m + "\n";
		}
		return list;
	}

	public boolean addToQueue(String customerName, String mediaTitle) {
		for (Customer c : customerList) {
			if (c.getName().equals(customerName)) {
				return c.addToQueue(mediaTitle);
			}
		}
		return false;
	}

	public boolean removeFromQueue(String customerName, String mediaTitle) {
		for (Customer c : customerList) {
			if (c.getName().equals(customerName)) {
				return c.removeFromQueue(mediaTitle);
			}
		}
		return false;
	}

	public String processRequests() {
		customerList.sort(null);
		String message = "";
		for (Customer c : customerList) {
			if (c.getPlan().equals("LIMITED")) {
				message += processLimitedRequests(c);
			} else {
				message += processUnlimitedRequests(c);
			}
		}
		return message;
	}
	
	private String processLimitedRequests(Customer c) {
	    String message = "";
	    
	    for (int i = 0; i < limitedPlanLimit - c.rented.size() && c.queue.size() != 0; i++) {
	        String title = c.queue.get(i); 
	        
	        Media media = findMedia(title);
	        
	        if (media.getCopiesAvailable() > 0) {
	            c.addRented(title);
	            media.setCopiesAvailable(media.getCopiesAvailable() - 1);
	            message += "Sending " + title + " to " + c.getName() + "\n";
	            i--;
	        }
	    }
	    
	    return message;
	}

	private String processUnlimitedRequests(Customer c) {
	    String message = "";
	    
        ArrayList<String> queueCopy = new ArrayList<>(c.queue);

        for (String title : queueCopy) {
            Media media = findMedia(title);
            if (media.getCopiesAvailable() > 0) {
            	  c.addRented(title);
                  media.setCopiesAvailable(media.getCopiesAvailable() - 1);
                  message += "Sending " + title + " to " + c.getName() + "\n";
			}
        }
        
	    return message;
	}
	
	private Media findMedia(String title) {
		for (Media media : mediaList) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		return null;
	}

	public boolean returnMedia(String customerName, String mediaTitle) {
		for (Customer c : customerList) {
			if (c.getName().equals(customerName)) {
				c.removeRented(mediaTitle);
				Media media = findMedia(mediaTitle);
				media.setCopiesAvailable(media.getCopiesAvailable() + 1);
				return true;
			}
		}
		return false;
	}

	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {
		ArrayList<String> titles = new ArrayList<>();
		
		if (title == null && rating == null && artist == null && songs == null) {
			mediaList.sort(null);
			for (Media media : mediaList) {
				titles.add(media.getTitle());
			}
			return titles;
		}
		
		// Add every title that matches the parameter first then filter later
		if (title != null) {
			titles.addAll(searchForTitle(title));
		}
		if (rating != null) {
			titles.addAll(searchForRating(rating));
		}
		if (artist != null) {
			titles.addAll(searchForArtist(artist));
		}
		if (songs != null) {
			titles.addAll(searchForSongs(songs));
		}
		
		// Makes sure only titles that match every parameter are returned
		if (title != null) {
	        titles.retainAll(searchForTitle(title));
	    }
	    if (rating != null) {
	        titles.retainAll(searchForRating(rating));
	    }
	    if (artist != null) {
	        titles.retainAll(searchForArtist(artist));
	    }
	    if (songs != null) {
	        titles.retainAll(searchForSongs(songs));
	    }
		
		titles.sort(null);
		return titles;
	}
	
	private ArrayList<String> searchForTitle(String title) {
		ArrayList<String> mediaTitles = new ArrayList<>();
		
		for (Media media : mediaList) {
			if (media.getTitle().contains(title)) {
				mediaTitles.add(title);
			}
		}
		return mediaTitles;
	}
	
	private ArrayList<String> searchForRating(String rating) {
		ArrayList<String> mediaTitles = new ArrayList<>();
		
		for (Media media : mediaList) {
			if (media instanceof Movie && ((Movie) media).getRating()
					.contains(rating)) {
				mediaTitles.add(media.getTitle());
			}
		}
		return mediaTitles;
	}
	
	private ArrayList<String> searchForArtist(String artist) {
		ArrayList<String> mediaTitles = new ArrayList<>();
		
		for (Media media : mediaList) {
			if (media instanceof Album && ((Album) media).getArtist()
					.contains(artist)) {
				mediaTitles.add(media.getTitle());
			}
		}
		return mediaTitles;
	}
	
	private ArrayList<String> searchForSongs(String songs) {
		ArrayList<String> mediaTitles = new ArrayList<>();
		
		for (Media media : mediaList) {
			if (media instanceof Album && ((Album) media).getSongs()
					.contains(songs)) {
				mediaTitles.add(media.getTitle());
			}
		}
		return mediaTitles;
	}

}
