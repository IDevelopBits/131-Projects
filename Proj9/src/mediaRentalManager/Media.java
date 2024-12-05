package mediaRentalManager;

public interface Media {
	public String getTitle();
	public void setTitle(String title);
	
	public int getCopiesAvailable();
	public void setCopiesAvailable(int copiesAvailable);
}
